package nyc.c4q.lukesterlee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Luke Lee on 4/26/15.
 */
public class MyMapReduce<E, V> {

    public Iterable<V> map(Iterable<E> x, Mapper<E, V> y) {

        ArrayList<V> list = new ArrayList<V>();
        for (E something : x) {
            list.add(y.f(something));
        }
        return list;
    }

    public E reduce(Iterable<E> x, Reducer<E> y) {

        E sum;

        for (E something : x) {
            sum += y.g(something, sum);
        }

        return sum;
    }

}
