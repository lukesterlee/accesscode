package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/25/15.
 */
public class Animal {

    int age;
    String gender;
    String name;


    public Animal() {

    }

    public void makeSound() {
        System.out.println("I'm an animal!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
