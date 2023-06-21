import logo from './logo.svg';
import './App.css';
import {MovieForm} from "./MovieForm";
import {MovieList} from "./MovieList";
import React from "react";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <MovieForm></MovieForm>
        <MovieList></MovieList>
      </header>
    </div>
  );
}

export default App;
