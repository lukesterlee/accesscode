package nyc.c4q.lukesterlee;

import java.util.ArrayList;

/**
 * Created by Luke Lee on 4/1/2015.
 */
public class Course {

    String name;

    private static String schoolName;

    private ArrayList<Person> studentsList;

    public Course(String name) {
        this.name = name;
        studentsList = new ArrayList<Person>();
    }

    public void register(Person p1) {
        studentsList.add(p1);
        p1.
    }

    public static void setSchoolName(String newName) {
        schoolName = newName;
    }
}
