package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview("movie1", "Five STARTS");
        MovieReview movie2 = new MovieReview("movie2", "Four STARTS");
        MovieReview[] movieReviews = new MovieReview[]{movie1, movie2};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("Title : " + movieReview.getTitle() + " Review : " + movieReview.getReview());
        }
    }
}
