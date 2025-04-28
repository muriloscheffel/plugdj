import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import "./LoginCard.css";

function LoginCard() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const navigate = useNavigate();

  const handleLogin = async () => {
    if (!email || !password) {
      setError("Preencha todos os campos");
      return;
    }
    if (!email.includes("@")) {
      setError("Email inválido");
      return;
    }
    try {
      const response = await axios.post("http://localhost:8080/api/auth/login", {
        email,
        password,
      });
      // Supondo que o backend retorne um token
      const { token } = response.data;

      // Salve o token no localStorage ou cookies
      localStorage.setItem("authToken", token);

      // Redirecione para a página inicial ou dashboard
      navigate("/home");
    // eslint-disable-next-line @typescript-eslint/no-unused-vars
    } catch (err) {
      setError("Credenciais inválidas ou erro no servidor");
    }
  };

  return (
    <div className="main-div">
      <h3>Login</h3>
      <input
        type="email"
        placeholder="Seu email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <h3>Password</h3>
      <input
        type="password"
        placeholder="Sua senha"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      {error && <p className="error-message">{error}</p>}
      <button onClick={handleLogin}>Login</button>
      <div className="extra-buttons">
        <button>Sign Up</button>
        <button>Forgot Password</button>
      </div>
    </div>
  );
}

export default LoginCard;
