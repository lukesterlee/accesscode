package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/1/2015.
 */
public class Cat {

    public String name;
    private int height;

    public Cat(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("Mimi");
        Cat c2 = new Cat("Bobo");

        c1.height = 27;
        c2.height = 0; // What?????
    }
}