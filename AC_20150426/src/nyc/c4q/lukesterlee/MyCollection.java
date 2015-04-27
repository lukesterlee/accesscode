package nyc.c4q.lukesterlee;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Luke Lee on 4/26/15.
 */
public class MyCollection<T> implements Collection {


    private Node first;
    private Node last;
    private int size;

    public MyCollection() {
        Node n = new Node();
        first = n;
        last = n;
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {

        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Node n = new Node(o);
        last.next = n;
        last = n;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {

        Node walker = first;
        while (walker.next != null) {
            if (walker.next.data.equals(o)) {
                walker.next = walker.next.next;
            } else {
                walker = walker.next;
            }

        }

        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Array[] toArray(Object[] a) {
        return new Array[a.length];
    }
}
