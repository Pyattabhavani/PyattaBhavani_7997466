import React from "react";
import office from "./office.jpg";

function App() {

  const offices = [
    {
      name: "Smart Office",
      rent: 55000,
      address: "Hyderabad"
    },
    {
      name: "Tech Park",
      rent: 75000,
      address: "Bangalore"
    },
    {
      name: "Business Hub",
      rent: 62000,
      address: "Chennai"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={office}
        alt="Office"
        width="400"
      />

      <hr />

      {offices.map((item, index) => (

        <div key={index} style={{ marginBottom: "20px" }}>

          <h2>{item.name}</h2>

          <p>
            <b>Address:</b> {item.address}
          </p>

          <p
            style={{
              color: item.rent < 60000 ? "red" : "green"
            }}
          >
            <b>Rent:</b> ₹{item.rent}
          </p>

        </div>

      ))}

    </div>
  );
}

export default App;