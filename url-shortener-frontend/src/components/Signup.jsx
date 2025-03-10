import React from "react";
import { Link } from "react-router-dom";
import './Signup.css'; // Import the CSS file

const Signup = () => {
  return (
    <div className="signup-container">
      <h2 className="signup-title">Sign Up</h2>
      <form className="signup-form">
        <div className="form-group">
          <label className="form-label">Name</label>
          <input
            type="text"
            placeholder="Enter your name"
            className="form-input"
          />
        </div>
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
        <button className="signup-button">
          Sign Up
        </button>
      </form>
      <p className="login-link">
        Already have an account?{" "}
        <Link to="/login" className="login-link-text">
          Login
        </Link>
      </p>
    </div>
  );
};

export default Signup;
