import './App.css';
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
            <h1>Movies</h1>
            <div className="block-list">
                <ul>{movies.map((movie) => (
                    <li key={movie.id}>
                    <span>
                        <a href={'http://localhost:8080/movies/' + movie.id}> {movie.title + ' -  ' + movie.director}</a>
                    </span>
                    </li>
                ))}
                </ul>
            </div>
        </div>);
}

export default App;
