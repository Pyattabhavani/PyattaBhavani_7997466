import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore() {
  const Name = "Bhavani";
  const School = "MRECW";
  const Total = 500;
  const Goal = 450;

  const Average = Total / 5;

  return (
    <div className="container">
      <h1>Student Details</h1>

      <p><b>Name:</b> {Name}</p>
      <p><b>School:</b> {School}</p>
      <p><b>Total:</b> {Total}</p>
      <p><b>Goal:</b> {Goal}</p>
      <p><b>Average Score:</b> {Average}</p>
    </div>
  );
}

export default CalculateScore;