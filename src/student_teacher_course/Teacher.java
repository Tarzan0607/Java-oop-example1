package student_teacher_course;

public class Teacher extends Person {

    public int salary;

    public Teacher(String firstName, String lastName, String email, int salary) {
        // call the constructor in Person, my super class
        super(firstName, lastName, email);
        // now do things that super - the constructor for Person - did not fix
        this.salary = salary;
    }

    // methods
    public void joinCourse(Course courseToJoin) {
        if (!courses.contains(courseToJoin)) {
            courses.add(courseToJoin);
        }
        if (!courseToJoin.teachers.contains(this)) {
            courseToJoin.addTeacher(this);
        }
        ;
    }

    public void leaveCourse(Course courseToLeave) {
        courses.remove(courseToLeave);
        if (courseToLeave.teachers.contains(this)) {
            courseToLeave.removeTeacher(this);
        }
        ;
    }

    // toString - how to display the instance as a string
    @Override
    public String toString() {
        // super.toString() calls the toString method in our super class Person
        return "Teacher " + super.toString() + " salary: " + salary;
    }

}
