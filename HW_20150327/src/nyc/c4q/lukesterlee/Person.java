package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 3/25/15.
 * A Person class
 */

public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // checkSameCity accepts as input two Person instances and checks if they live in the same city.
    // return value : boolean
    public static boolean checkSameCity(Person p1, Person p2) {
        return p1.getCity().equals(p2.getCity());
    }

    // A Person has recently had a child, whose name is 'Abc'.
    // Write a function called registerChild which accepts as input a Person instance(Parent)
    // @return a new Person instance for the child, which has the same phoneNumber and city as the parent.
    public static Person registerChild(Person parent) {
        Person child = new Person("Abc");
        child.setCity(parent.getCity());
        child.setPhoneNumber(parent.getPhoneNumber());
        return child;
    }
}