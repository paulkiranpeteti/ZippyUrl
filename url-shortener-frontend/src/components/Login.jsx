import React from "react";
import { Link, useNavigate } from "react-router-dom";
import './Login.css'; // Import the CSS file

const Login = () => {
  const navigate = useNavigate();

  const handleLogin = (e) => {
    e.preventDefault();
    // Add your login logic here
    navigate('/user');
  };

  return (
    <div className="login-container">
      <h2 className="login-title">Login</h2>
      <form className="login-form" onSubmit={handleLogin}>
        <div className="form-group">
          <label className="form-label">Email</label>
          <input
            type="email"
            placeholder="Enter email"
            className="form-input"
          />
        </div>
        <div className="form-group">
          <label className="form-label">Password</label>
          <input
            type="password"
            placeholder="Enter password"
            className="form-input"
          />
        </div>
        <button className="login-button">
          Login
        </button>
      </form>
      <p className="signup-link">
        Don't have an account?{" "}
        <Link to="/signup" className="signup-link-text">
          Sign Up
        </Link>
      </p>
    </div>
  );
};

export default Login;
