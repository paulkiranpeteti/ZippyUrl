import React from "react";
import "./Home.css";
import Navbar from "./Navbar";
import zippygif from "../images/web-dev-website-development.mp4";  

const Home = () => {
  return (
    <div className="home-wrapper">
      <Navbar />
      <div className="home-container">
        <h1 className="home-title">Welcome to Zippy Link</h1>
        <video className="home-video" autoPlay loop muted>
          <source src={zippygif} type="video/mp4" />
          Your browser does not support the video tag.
        </video>
      </div>
    </div>
  );
};

export default Home;
