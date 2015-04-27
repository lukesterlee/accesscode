package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/26/15.
 */
public class Animal implements Comparable {

    String spicies;

    public Animal() {

    }

    public Animal(String species) {
        this.spicies = species;
    }

    public String getSpicies() {
        return spicies;
    }

    public void setSpicies(String spicies) {
        this.spicies = spicies;
    }

    @Override
    public int compareTo(Animal o) {
        return this.getSpicies().compareTo(o.getSpicies());
    }

    @Override
    public boolean equals(Animal obj) {
        return this.getSpicies().equals(obj.getSpicies());
    }


}
