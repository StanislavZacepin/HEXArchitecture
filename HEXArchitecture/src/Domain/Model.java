package Domain;

import Application.MovieApp;

public class Model {
    // TODO: Общая логика. ПОка ток принятие запроса от пользователя
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    public void Run(MovieSearchRequest movieSearchRequest)
    {
        movieApp.accept(movieSearchRequest);
    }
}
