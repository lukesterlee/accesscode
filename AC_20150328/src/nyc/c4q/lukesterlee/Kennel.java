package nyc.c4q.lukesterlee;

import java.util.ArrayList;

/**
 * Created by Luke Lee on 3/28/15.
 */
public class Kennel {


    private ArrayList<Dog> kennel;

    public Kennel() {
        this.kennel = new ArrayList<Dog>();
    }

    public ArrayList<Dog> getKennel() {
        return this.kennel;
    }

    public void setKennel(ArrayList<Dog> kennel) {
        this.kennel = kennel;
    }

    public void addDog(Dog dog) {
        this.kennel.add(dog);
    }

    public int numOfDogs() {
        return this.kennel.size();
    }

    public boolean hasDogs() {
        return kennel.isEmpty();
    }

    public void shutdownKennel() {
        kennel.clear();
    }
}
