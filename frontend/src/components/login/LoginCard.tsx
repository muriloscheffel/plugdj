import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import "./LoginCard.css";

function LoginCard() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const navigate = useNavigate();
  const [isVisible, setIsVisible] = useState(false);

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
      const response = await axios.post(
        "http://localhost:8080/api/auth/login",
        {
          email,
          password,
        },
        {
          headers: {
            "Content-Type": "application/json",
          },
        }
      );
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

  const handleRegister = async () => {
    if (!name || !email || !password) {
      setError("Preencha todos os campos");
      return;
    }
    if (!email.includes("@")) {
      setError("Email inválido");
      return;
    }
    try {
      const response = await axios.post(
        "http://localhost:8080/api/auth/register",
        {
          name,
          email,
          password,
        },
        {
          headers: {
            "Content-Type": "application/json",
          },
        }
      );
      // Supondo que o backend retorne um token
      const { token } = response.data;

      // Salve o token no localStorage ou cookies
      localStorage.setItem("authToken", token);

      // Redirecione para a página inicial ou dashboard
      navigate("/home");
      // eslint-disable-next-line @typescript-eslint/no-unused-vars
    } catch (err) {
      setError("Erro ao registrar");
    }
  };

  return (
    <div className="flex flex-col items-center justify-center p-8 rounded-8px shadow-md w-full max-w-md">
      <div hidden={!isVisible}>
        <h3 className="h3-title">Nome</h3>
        <input
          className="def-input"
          type="text"
          placeholder="Seu nome"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </div>
      <h3 className="h3-title">Email</h3>
      <input
        className="def-input"
        type="email"
        placeholder="Seu email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <h3 className="h3-title">Password</h3>
      <input
        className="def-input"
        type="password"
        placeholder="Sua senha"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      {error && <p className="error-message">{error}</p>}
      <button
        className=" bg-btn-blue text-white px-4 py-2 rounded-b-sm cursor-pointer text-xl transition duration-200 w-full h-12 hover:bg-hover-btn-bg"
        onClick={isVisible ? handleRegister : handleLogin}
      >
        {isVisible == true ? "Register" : "Login"}
      </button>
      <div className="flex gap-4 mt-4" hidden={isVisible == true}>
        <button
        className="extra-btns"
          onClick={() => {
            setIsVisible(!isVisible);
          }}
        >
          {isVisible == true ? "Login" : "Sign Up"}
        </button>
        <button hidden={isVisible}>Forgot Password</button>
      </div>
    </div>
  );
}

export default LoginCard;
