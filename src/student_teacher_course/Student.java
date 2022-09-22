package student_teacher_course;

public class Student extends Person {

    public int totalYhps; // total number of taken yrkeshögskolepoäng

    public Student(String firstName, String lastName, String email, int totalYhps) {
        // call the constructor in Person, my super class
        super(firstName, lastName, email);
        // now do things that super - the constructor for Person - did not fix
        this.totalYhps = totalYhps;
    }

    // methods
    public void joinCourse(Course courseToJoin) {
        if (!courses.contains(courseToJoin)) {
            courses.add(courseToJoin);
        }
        if (!courseToJoin.students.contains(this)) {
            courseToJoin.addStudent(this);
        }
        ;
    }

    public void leaveCourse(Course courseToLeave) {
        courses.remove(courseToLeave);
        if (courseToLeave.students.contains(this)) {
            courseToLeave.removeStudent(this);
        }
        ;
    }

    // toString - how to display the instance as a string
    @Override
    public String toString() {
        // super.toString() calls the toString method in our super class Person
        return "Student " + super.toString() + " yhp: " + totalYhps;
    }

}
