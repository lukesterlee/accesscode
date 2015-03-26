package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/26/2015.
 */
public class VotingSimulator {

    public static void main(String[] args) {

        Election election = new Election("House of Cards");

        Contender c1 = new Contender("Francis Underwood");
        Contender c2 = new Contender("Jackie Sharp");
        Contender c3 = new Contender("Heather Dunbar");
        Contender c4 = new Contender("Barack Obama");

        election.add(c1);
        election.add(c2);
        election.add(c3);
        election.add(c4);

        ElectionManager manager = new ElectionManager();

    }
}
