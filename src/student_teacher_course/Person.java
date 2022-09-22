package student_teacher_course;

import java.util.ArrayList;

public class Person {

    // fields
    public String firstName;
    public String lastName;
    public String email;

    // courses - courses a Teacher teaches or a Student studies
    public ArrayList<Course> courses = new ArrayList<>();

    // constructor (runs when we write new Person)
    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // toString - how to display the instance as a string
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(
                "Person " + firstName + " " + lastName + " (" + email + ")" + "my courses: ");
        for (Course course : courses) {
            info.append(course.toShortString());
            info.append(", ");
        }
        return info.toString();
    }

}