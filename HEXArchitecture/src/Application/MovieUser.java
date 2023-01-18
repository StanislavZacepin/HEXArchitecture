package Application;

import Domain.MovieSearchRequest;

public class MovieUser {
    // TODO: Струткура  получения данных пользователя для вызова логики, соиденения портов между собой
    private IUserInput userInputDriverPort;

    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
