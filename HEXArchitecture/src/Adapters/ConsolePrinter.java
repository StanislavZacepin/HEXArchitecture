package Adapters;

import Application.IPrintMovieReviews;
import Domain.MovieReview;

import java.util.List;

public class ConsolePrinter implements IPrintMovieReviews {
    // TODO: Плоказ пользователю. Вывод на консоль фильмов
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
