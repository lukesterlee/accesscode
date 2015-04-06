package nyc.c4q.lukesterlee;

import java.util.ArrayList;

/**
 * Created by Luke Lee on 4/5/15.
 */
public class Person2 {

    String name;
    int age;
    String address;
    String emailAddress;
    char gender;
    boolean areyouMarried;
    double height;
    private double weight;
    int ssnNumber;

    private String city;

    ArrayList<Person2> friendlist;

    static String planet;
    static int numberOfPeople = 0;
    static ArrayList<Person2> population = new ArrayList<Person2>();

    public Person2() {
        numberOfPeople++;
        friendlist = new ArrayList<Person2>();
        age = 0;
        population.add(this);

    }

    public Person2(String name) {
        this.name = name;
        age = 0;
        numberOfPeople++;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public static boolean checkSameCity(Person p1, Person p2) {

        return p1.getCity().equals(p2.getCity());

    }

    public double getWeight() {
        return this.weight;
    }

    public static double averageWeight() {
        int sum = 0;
        for (Person2 person : population) {
            sum += person.getWeight();
        }
        return sum/population.size();
    }


    public static void main(String[] args) {

        Person2 p1 = new Person2();
        String a = "Hello";

        Person2.averageWeight();




    }


}
