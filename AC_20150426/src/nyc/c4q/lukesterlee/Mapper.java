package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/26/15.
 */
public interface Mapper<E, V> {

    V f(E something);
}
