package Application;

import Domain.MovieReview;
import Domain.MovieSearchRequest;

import java.util.List;

public interface IFetchMovieReviews {
    // TODO: Интрефейс с методом  запроса из репозитория всё содержимое
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
