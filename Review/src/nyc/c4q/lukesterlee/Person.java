package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Luke Lee on 4/1/2015.
 */
public class Person {

    private String name;
    private String sex;
    private String emailAddress;
    private String identity;
    private String instagramUsername;
    private String city;

    private int age;
    private int phoneNumber;
    private int ssnNumber;
    private int zipCode;
    private String school;

    private boolean getMarried;

    private ArrayList<Person> friendsList;

    private static int numberOfPeople = 0;

    public Person() {

        String a = "hello";
        Scanner input = new Scanner(System.in);
        Character.
        age = 0;
        friendsList = new ArrayList<Person>();
        numberOfPeople++;
    }

    public Person(String name) {
        this.name = name;
        age = 0;
        friendsList = new ArrayList<Person>();
        numberOfPeople++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isGay() {
        return identity.equals("Gay");
    }

    public void addFriend(Person newFriend) {
        friendsList.add(newFriend);
    }

    public Person giveBirth(String name) {
        Person baby = new Person(name);
        return baby;
    }

    public static boolean checkSameCity(Person p1, Person p2) {
        return p1.getCity().equals(p2.getCity());
    }





}
