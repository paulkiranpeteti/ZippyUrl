import React from "react";
import './User.css'; // Import the CSS file

const User = () => {
  const scrollToSection = (sectionId) => {
    document.getElementById(sectionId).scrollIntoView({ behavior: 'smooth' });
  };

  return (
    <div className="user-container">
      <nav className="user-nav">
        <button onClick={() => scrollToSection('user-home')}>User Home</button>
        <button onClick={() => scrollToSection('create-url')}>Create URL</button>
        <button onClick={() => scrollToSection('view-url')}>View URL</button>
      </nav>
      <section id="user-home" className="user-section">
        <h2>Welcome to Zippy Links</h2>
        <img src="sample-photo.jpg" alt="Sample" className="sample-photo" />
      </section>
      <section id="create-url" className="user-section">
        <h2>Create URL</h2>
        <input type="text" placeholder="Enter URL" className="url-input" />
        <button className="create-url-button">Create</button>
      </section>
      <section id="view-url" className="user-section">
        <h2>View URLs</h2>
        <table className="url-table">
          <thead>
            <tr>
              <th>Short URL</th>
              <th>Original URL</th>
            </tr>
          </thead>
          <tbody>
            {/* Add your URL data here */}
          </tbody>
        </table>
      </section>
    </div>
  );
};

export default User;