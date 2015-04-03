package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/2/2015.
 */
public class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public Bicycle() {

    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}