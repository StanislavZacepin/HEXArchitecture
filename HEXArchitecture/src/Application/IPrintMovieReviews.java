package Application;

import Domain.MovieReview;

import java.util.List;

public interface IPrintMovieReviews {
    // TODO: Интерфейс для отображения пользователю.
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
