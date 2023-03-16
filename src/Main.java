public class Main {
    public static void main(String[] args) {

        final String myName = "Abdallah";
        final int myAge = 23;

        Student st = new Student("Abdallah", "Dahmou", 4);

        //TODO Print something
        System.out.println(myName + " " + myAge);

        if (myAge >= 18) {
            System.out.println("You are allowed to drive!!");
        } else {
            System.out.println("You are not allowed to drive!");
        }

        int month = 3;
        String monthString;

        // TODO Try Switch Cases in Java
        switch (month) {
            case 1:
                monthString = "January";
                System.out.println(monthString);
                break;
            default:
                break;
        }
        // TODO Try For loop
        for (int i = 1; i <= 100; i++) {
            System.out.println("Day " + i);
        }

        // TODO Try While Loop
        int count = 1;
        while (count < 10) {

            System.out.println(count);
            count++;
        }

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


class Program {
    String name;
    String[] listOfCourses;

    public Program(String name, String[] listOfCourses) {

    }
}

class Lecturer {

}

class Course {

}