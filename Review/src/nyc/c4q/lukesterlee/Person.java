package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/1/2015.
 */
public class Person {

    private String name;
    private String sex;
    private String emailAddress;
    private String identity;
    private String instagramUsername;


    private int age;
    private int phoneNumber;
    private int ssnNumber;
    private int zipCode;

    private boolean getMarried;

    private static int numberOfPeople = 0;
    private static int numberOfMen = 0;
    private static int numberOfWomen = 0;
    private static int numberOfHomos = 0;
    private static int numberOfStraights = 0;

    public boolean isGay() {
        return identity.equals("Gay");
    }



}
