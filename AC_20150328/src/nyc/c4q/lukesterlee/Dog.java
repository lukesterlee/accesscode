package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 3/28/15.
 */
public class Dog {

    private String name;
    private String breed;
    private int age;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
