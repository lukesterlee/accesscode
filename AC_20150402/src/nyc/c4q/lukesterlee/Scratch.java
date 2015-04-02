package nyc.c4q.lukesterlee;
import java.util.HashSet;

/**
 * Created by Luke Lee on 4/2/15.
 */
public class Scratch {
    public static void main(String[] args) {
        HashSet<Integer> odd = new HashSet<Integer>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(57);

        for (Integer num : odd) {
            System.out.println(num);
        }

        HashSet<Integer> even = new HashSet<Integer>();

        even.addAll(odd);

        even.removeAll(odd);

        HashSet<Integer> odd2 = new HashSet<Integer>(odd);
        HashSet<Integer> odd3 = new HashSet<Integer>(odd);
        System.out.println(odd2 == odd2);
        System.out.println(odd2 == odd3);
        System.out.println(odd2.equals(odd3));

    }
}
