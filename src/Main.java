public class Main {
    public static void main(String[] args) {

        final String myName = "Abdallah";
        final int myAge = 23;

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