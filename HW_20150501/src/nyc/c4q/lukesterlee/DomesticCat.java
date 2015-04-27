package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/26/15.
 */
public class DomesticCat extends Animal implements Domestic {

    String name;

    public DomesticCat(String species, String name) {
        this.spicies = species;
        this.name = name;

    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int compareTo(Animal o) {
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
