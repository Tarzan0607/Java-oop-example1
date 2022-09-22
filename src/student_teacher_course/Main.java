package student_teacher_course;

public class Main {
    public static void main(String[] args) {

        Course python = new Course("Python", 20);
        Course databases = new Course("Databaser", 25);

        Student anna = new Student("Anna", "Andersson", "anna@pythonfanatics.com", 1200);

        Student peter = new Student("Peter", "Petterson", "peter@newbieinpython.com", 0);

        Teacher thomas = new Teacher("Thomas", "Frank", "thomas@nodehill.com", 1);

        Teacher manuel = new Teacher("Manuel", "Noltorp", "manuel@nodehill.com", 0);
        ;
        anna.joinCourse(python);
        peter.joinCourse(python);
        thomas.joinCourse(python);

        manuel.joinCourse(databases);

        databases.addStudent(anna);

        System.out.println("\n\nANNA:");
        System.out.println(anna);
        System.out.println("\n\nPETER:");
        System.out.println(peter);
        System.out.println("\n\nTHOMAS:");
        System.out.println(thomas);
        System.out.println("\n\nMANUEL:");
        System.out.println(manuel);

        python.removeStudent(anna); // ANNA QUITS PYTHON

        System.out.println("\n\nANNA AGAIN:");
        System.out.println(anna);

        System.out.println("\n\nPYTHON COURSE:");
        System.out.println(python);

        System.out.println("\n\nDATABASE COURSE:");
        System.out.println(databases);
    }
}