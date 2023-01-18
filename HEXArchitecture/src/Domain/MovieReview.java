package Domain;

public class MovieReview {
    // TODO: Фильм с параметрами: Название фильма, оценка, коментарий. В классе констрктор и переопределили toString
    String movieName;
    double movieScore;
    String remark;

    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    @Override
    public String toString() {
        return  " " +movieScore +" "+ remark;
    }
}
