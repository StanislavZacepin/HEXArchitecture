package Adapters;

import Application.IFetchMovieReviews;
import Application.IPrintMovieReviews;
import Application.IUserInput;
import Application.MovieApp;
import Domain.Model;
import Domain.MovieSearchRequest;

public class UserCommand implements IUserInput {
    // TODO: Команды пользователя
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}
