import React from "react";

function User() {
  return (
    <div>
      <h2>Welcome User</h2>

      <h3>Available Flights</h3>

      <ul>
        <li>Hyderabad → Delhi</li>
        <li>Hyderabad → Bangalore</li>
        <li>Hyderabad → Chennai</li>
      </ul>

      <button>Book Ticket</button>
    </div>
  );
}

export default User;