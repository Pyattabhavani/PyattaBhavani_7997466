import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: [],
      error: null
    };
  }

  // Fetch data from API
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        const postList = data.map(
          (item) => new Post(item.id, item.title, item.body)
        );

        this.setState({ posts: postList });
      })
      .catch((error) => {
        this.setState({ error });
      });
  }

  // Lifecycle hook
  componentDidMount() {
    this.loadPosts();
  }

  // Error handling lifecycle hook
  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.toString());
    console.error(error, info);
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h1>Blog Posts</h1>

        {this.state.posts.map((post) => (
          <div
            key={post.id}
            style={{
              border: '1px solid #ccc',
              marginBottom: '15px',
              padding: '10px',
              borderRadius: '5px'
            }}
          >
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;