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
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Domestic o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Domestic obj) {
        return this.getName().equals(obj.getName());
    }
}
