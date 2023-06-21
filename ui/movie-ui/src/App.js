import './App.css';
import {MovieForm} from "./MovieForm";
import React, {useEffect, useState} from "react";
import axios from "axios";

function App() {
    const [movies, setMovies] = useState([]);

    useEffect(() => {
        axios
            .get('http://localhost:8080/movies/all')
            .then((response) => {
                setMovies(response.data);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);

    return (
        <div className="App">
            <header className="App-header">
                <MovieForm></MovieForm>
                <ul>{movies.map((movie) => (
                    <li key={movie.id}>
                    <span>
                        {movie.title + ' -  ' + movie.director}
                    </span>
                    </li>
                ))}
                </ul>
            </header>
        </div>);
}

export default App;
