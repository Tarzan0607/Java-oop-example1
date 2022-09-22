package student_teacher_course;

import java.util.ArrayList;

public class Course {

    // fields
    public String name;
    public int yhp;
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Teacher> teachers = new ArrayList<>();

    // constructor
    public Course(String name, int yhp) {
        this.name = name;
        this.yhp = yhp;
    }

    // methods
    public void addStudent(Student studentToAdd) {
        if (!studentToAdd.courses.contains(this)) {
            studentToAdd.joinCourse(this);
        }
        if (!students.contains(studentToAdd)) {
            students.add(studentToAdd);
        }
    }

    public void removeStudent(Student studentToRemove) {
        if (studentToRemove.courses.contains(this)) {
            studentToRemove.leaveCourse(this);
        }
        students.remove(studentToRemove);
    }

    public void addTeacher(Teacher teacherToAdd) {
        if (!teacherToAdd.courses.contains(this)) {
            teacherToAdd.joinCourse(this);
        }
        if (!teachers.contains(teacherToAdd)) {
            teachers.add(teacherToAdd);
        }
    }

    public void removeTeacher(Teacher teacherToRemove) {
        if (teacherToRemove.courses.contains(this)) {
            teacherToRemove.leaveCourse(this);
        }
        teachers.remove(teacherToRemove);
    }

    // toString - how to display the instance as a string
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(toShortString());
        info.append("Teachers\n");
        for (Teacher teacher : teachers) {
            info.append(teacher.toString().replaceAll(".*Person ", ""));
            info.append("\n");
        }
        info.append("Students\n");
        for (Student student : students) {
            info.append(student.toString().replaceAll(".*Person ", ""));
            info.append("\n");
        }
        return info.toString();
    }

    public String toShortString() {
        return "Course " + name + " (" + yhp + " yhp)\n";
    }

}
