package Domain;

public class MovieSearchRequest {
    // TODO: Запрос пользователья, можно использовать для сбора статистики
    String request;

    public MovieSearchRequest(String name) {
        this.request = name;
    }

    public String getMovieName() {
        return request;
    }
}
