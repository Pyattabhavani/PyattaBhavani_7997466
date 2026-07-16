import React, { useState } from "react";
import Guest from "./Guest";
import User from "./User";

function App() {
  const [loggedIn, setLoggedIn] = useState(false);

  return (
    <div style={{ padding: "20px" }}>
      <h1>Ticket Booking App</h1>

      {loggedIn ? (
        <>
          <button onClick={() => setLoggedIn(false)}>
            Logout
          </button>

          <User />
        </>
      ) : (
        <>
          <button onClick={() => setLoggedIn(true)}>
            Login
          </button>

          <Guest />
        </>
      )}
    </div>
  );
}

export default App;