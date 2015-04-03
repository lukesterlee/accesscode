package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/2/2015.
 */
public class Movie {

    private String title;
    private String jenre;
    private String type;

    static int numberOfMovies = 0;

    public Movie() {
        numberOfMovies++;
    }

    public Movie(String title) {
        this.title = title;
        numberOfMovies++;
    }
}
