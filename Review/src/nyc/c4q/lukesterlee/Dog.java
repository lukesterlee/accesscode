package nyc.c4q.lukesterlee;

import java.util.Calendar;

/**
 * Created by Luke Lee on 4/1/2015.
 */
public class Dog extends Animal{

    private String name;
    private static int numOfLegs;
    private int age;
    private Calendar birthday;

    public Dog() {
        numOfLegs = 4;
        birthday = Calendar.getInstance();
        age = 0;
    }

    public Dog(String name) {
        this.name = name;
        numOfLegs = 4;
        birthday = Calendar.getInstance();
        age = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void bark() {
        System.out.println("Brrrrr");
    }

    public Dog giveBirth(String name) {
        Dog baby = new Dog(name);
        return baby;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
