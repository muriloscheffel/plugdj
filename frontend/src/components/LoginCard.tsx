import "./LoginCard.css"

function LoginCard() {
  return (
    <div className="main-div">
      <h3>Login</h3>
      <input type="text" />
      <h3>Password</h3>
      <input type="password" />
      <button>Login</button>
      <div className="extra-buttons">
        <button>Sign Up</button>
        <button>Forgot Password</button>
      </div>
    </div>
  )
}

export default LoginCard