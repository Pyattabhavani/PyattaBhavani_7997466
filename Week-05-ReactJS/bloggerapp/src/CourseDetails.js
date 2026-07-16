import React from "react";

function CourseDetails() {
  const courses = [
    { id: 1, name: "ReactJS", duration: "6 Weeks" },
    { id: 2, name: "Java Full Stack", duration: "12 Weeks" }
  ];

  return (
    <div>
      <h2>Course Details</h2>
      {courses.map(course => (
        <div key={course.id}>
          <p><b>Course:</b> {course.name}</p>
          <p><b>Duration:</b> {course.duration}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;