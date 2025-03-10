import React from "react";
import { Link } from "react-router-dom";
import './Home.css'; // Import the CSS file

const Home = () => {
  return (
    <div className="home-container">
      <h1 className="home-title">Welcome to Zippy Link</h1>
      <nav className="navbar">
        <a href="#home-section">Home</a>
        <a href="#create-section">Create Short URL</a>
        <a href="#view-section">View URLs</a>
        <Link to="/login">Logout</Link>
      </nav>
      <section id="home-section" className="section">
        <h2>Home</h2>
        <p>This is the home section.</p>
      </section>
      <section id="create-section" className="section">
        <h2>Create Short URL</h2>
        <p>This is the create short URL section.</p>
      </section>
      <section id="view-section" className="section">
        <h2>View URLs</h2>
        <p>This is the view URLs section.</p>
      </section>
    </div>
  );
};

export default Home;