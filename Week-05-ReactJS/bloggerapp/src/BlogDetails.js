import React from "react";

function BlogDetails() {
  const blogs = [
    { id: 1, title: "React Hooks", writer: "John" },
    { id: 2, title: "ES6 Features", writer: "David" }
  ];

  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map(blog => (
        <div key={blog.id}>
          <p><b>Title:</b> {blog.title}</p>
          <p><b>Writer:</b> {blog.writer}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;