package nyc.c4q.ac21;

import java.util.HashMap;

public class MoonsAndPlanets {

    public static HashMap<String, Integer> getNumberOfMoons() {
        HashMap<String, Integer> numberOfMoons = new HashMap<String, Integer>();
        numberOfMoons.put("Mercury", 0);
        numberOfMoons.put("Venus", 0);
        numberOfMoons.put("Earth", 1);
        numberOfMoons.put("Mars", 2);
        numberOfMoons.put("Jupiter", 67);
        numberOfMoons.put("Saturn", 62);
        numberOfMoons.put("Uranus", 27);
        numberOfMoons.put("Neptune", 14);
        numberOfMoons.put("Pluto", 5);

        return numberOfMoons;
    }

    public static Integer getNumberOfMoons(String planet) {

        return getNumberOfMoons().get(planet);

    }

    public static boolean isPlanet(String name) {
        return getNumberOfMoons().containsKey(name);
    }

    public static void main(String[] args) {


        System.out.println(getNumberOfMoons("Pluto"));

        System.out.println(getNumberOfMoons());

        System.out.println(isPlanet("Uranus"));
    }
}
