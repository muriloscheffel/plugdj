import LoginCard from "../components/login/LoginCard";
import LoginImageCard from "../components/login/LoginImageCard";

function LoginPage() {
  return (
    <div className="flex h-screen w-screen">
      <LoginCard />
      <LoginImageCard />
    </div>
  );
}

export default LoginPage;
