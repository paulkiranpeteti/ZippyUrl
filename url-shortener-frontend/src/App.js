import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Login from "./components/Login";
import Signup from "./components/Signup";
import User from "./components/User";
import './App.css'; // Import the CSS file
import Home from './components/Home';

const App = () => {
  return (
    <Router>
      <div className="app-container">
        <main className="app-main">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/login" element={<Login />} />
            <Route path="/signup" element={<Signup />} />
            <Route path="/user" element={<User />} />
          </Routes>
        </main>
      </div>
    </Router>
  );
};

// const Home = () => {
//   return (
//     <div className="home-container">
//       <h1 className="home-title">URL Shortener</h1>
//     </div>
//   );
// };

export default App;
