package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/26/2015.
 */
public class VotingSimulator {

    public static void main(String[] args) {

        // Create an Election object, and given the Election a name.
        Election election = new Election("House of Cards");

        // Create a few Contender objects. Add these to the Election object.
        // Make sure that the contender names are distinct!
        Contender c1 = new Contender("Francis Underwood");
        Contender c2 = new Contender("Jackie Sharp");
        Contender c3 = new Contender("Heather Dunbar");
        Contender c4 = new Contender("Barack Obama");
        election.add(c1);
        election.add(c2);
        election.add(c3);
        election.add(c4);

        // Create a ElectionManager object. Ask it to manage the Election object created above.
        ElectionManager manager = new ElectionManager();
        manager.manage(election);

        // Ask the ElectionManager to initiatePolling
        manager.initiatePolling();

        // Follow the instructions on the console.
        // After each round of polling you will be asked(within the console) whether you want to continue or not.

        // Ask the ElectionManager to displayResults.
        manager.displayResults();


    }
}
