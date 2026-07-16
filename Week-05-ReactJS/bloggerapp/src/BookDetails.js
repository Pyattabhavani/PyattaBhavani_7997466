import React from "react";

function BookDetails() {
  const books = [
    { id: 1, name: "Java Programming", author: "James Gosling" },
    { id: 2, name: "React Basics", author: "Jordan Walke" },
    { id: 3, name: "Python Guide", author: "Guido van Rossum" }
  ];

  return (
    <div>
      <h2>Book Details</h2>
      {books.map(book => (
        <div key={book.id}>
          <p><b>Book:</b> {book.name}</p>
          <p><b>Author:</b> {book.author}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default BookDetails;