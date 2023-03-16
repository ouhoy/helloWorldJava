public class Main {
    public static void main(String[] args) {

        Student studentOne = new Student("Abdallah", "Dahmou", 4);
        Student studentTwo = new Student("Rania", "Samih", 6);

        Course qualitySoftware = new Course("Developing Quality Software and Systems", 30, "Building high-quality software systems.");
        Course webDevelopment = new Course("Web development", 25, "Building web applications with NodeJS and ReactJS.");

        Course[] coursesByLecturerOne = {qualitySoftware};
        Lecturer lecturerOne = new Lecturer("Younes", "El Amrani", coursesByLecturerOne);


        Course[] SECourses = {qualitySoftware, webDevelopment};
        Student[] SEStudents = {studentOne};
        Program SE = new Program("Software Engineering", SECourses, SEStudents);

        Course[] BACourses = {qualitySoftware};
        Student[] BAStudents = {studentTwo};
        Program BA = new Program("Software Engineering", BACourses, BAStudents);

        Program[] SISTPrograms = {SE, BA};
        School SIST = new School("SIST", "School of software engineering and business", SISTPrograms);


    }
}

class Person {

    String firstName;
    String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


class Student extends Person {

    int level;

    public Student(String firstName, String lastName, int level) {
        super(firstName, lastName);
        this.level = level;
    }
}

class Lecturer extends Person {
    Course[] lecturedCourses;

    public Lecturer(String firstName, String lastName, Course[] lecturedCourses) {
        super(firstName, lastName);
        this.lecturedCourses = lecturedCourses;
    }
}

class Program {
    String name;
    Course[] listOfCourses;

    Student[] students;

    public Program(String name, Course[] listOfCourses, Student[] students) {

        this.name = name;
        this.listOfCourses = listOfCourses;
        this.students = students;

    }
}


class Course {

    String title, description;
    int hv;

    public Course(String title, int hv, String description) {
        this.title = title;
        this.hv = hv;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHv() {
        return hv;
    }

    public void setHv(int hv) {
        this.hv = hv;
    }
}

class School {

    String name, description;
    Program[] programs;

    public School(String name, String description, Program[] programs) {

        this.name = name;
        this.description = description;
        this.programs = programs;


    }
}