import React, { useState } from "react";
import './User.css'; // Import the CSS file
import zippyimg from '../images/zippylinks_image.jpg';

const User = () => {
  const [longUrl, setLongUrl] = useState('');
  const [keyword, setKeyword] = useState('');
  const [shortUrl, setShortUrl] = useState('');

  const scrollToSection = (sectionId) => {
    document.getElementById(sectionId).scrollIntoView({ behavior: 'smooth' });
  };

  const handleCreateUrl = () => {
    // Add your URL creation logic here
    console.log('Long URL:', longUrl);
    console.log('Keyword:', keyword);
    // Simulate URL shortening logic
    const generatedShortUrl = `https://zippy.url/${keyword}`;
    setShortUrl(generatedShortUrl);
  };

  const staticUrls = [
    { shortUrl: 'https://zippy.url/abc123', longUrl: 'https://example.com/very-long-url-1' },
    { shortUrl: 'https://zippy.url/def456', longUrl: 'https://example.com/very-long-url-2' },
    { shortUrl: 'https://zippy.url/ghi789', longUrl: 'https://example.com/very-long-url-3' },
  ];

  return (
    <div className="user-container">
      <nav className="user-nav">
        <h1>ZippyLinks</h1>
        <div className="nav-buttons">
          <button onClick={() => scrollToSection('user-home')}>User Home</button>
          <button onClick={() => scrollToSection('create-url')}>Create URL</button>
          <button onClick={() => scrollToSection('view-url')}>View URL</button>
        </div>
      </nav>
      <section id="user-home" className="user-section">
        <h2>Welcome to Zippy Links</h2>
        <img src={zippyimg} alt="ZippyLinks Banner" className="banner-image" />
      </section>
      <section id="create-url" className="user-section">
        <h2>Create URL</h2>
        <input
          type="text"
          placeholder="Enter long URL"
          className="url-input"
          value={longUrl}
          onChange={(e) => setLongUrl(e.target.value)}
        />
        <input
          type="text"
          placeholder="Enter keyword for short URL"
          className="url-input"
          value={keyword}
          onChange={(e) => setKeyword(e.target.value)}
        />
        <button className="create-url-button" onClick={handleCreateUrl}>Create</button>
        {shortUrl && (
          <div className="short-url-display">
            <p>Shortened URL:</p>
            <a href={shortUrl} target="_blank" rel="noopener noreferrer">{shortUrl}</a>
          </div>
        )}
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
            {staticUrls.map((url, index) => (
              <tr key={index}>
                <td><a href={url.shortUrl} target="_blank" rel="noopener noreferrer">{url.shortUrl}</a></td>
                <td>{url.longUrl}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </section>
    </div>
  );
};

export default User;