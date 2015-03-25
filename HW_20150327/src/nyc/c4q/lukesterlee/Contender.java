package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/25/2015.
 */
/**
 * A representation for a election Contender
 */
public class Contender {

    private String name;
    private int votesReceived;

    /**
     * Contender constructor
     *
     * @param name A name of the Contender
     */
    public Contender(String name) {
        this.name = name;
        this.votesReceived = 0;
    }

    /**
     * default constructor
     */
    public Contender(){
    }
    /**
     * Increase votesReceived when someone votes for me
     */
    public void addVote() {
        votesReceived++;
    }

    /**
     * Display the name, and number of votesReceived received
     */
    public String toString() {
        return this.name + " received " + this.votesReceived + " votes" ;
    }

    /**
     * Getter for name
     * @return name of Contender
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for votesReceived
     * @return number of votes received
     */
    public int getVotesReceived() {
        return votesReceived;
    }

}