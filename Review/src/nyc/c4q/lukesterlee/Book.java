package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/1/2015.
 */
public class Book {

    private String name;
    private String author;

    private int year;
    private int numberOfPages;
    private int isbnNumber;

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
