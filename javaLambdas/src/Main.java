import java.util.Random;

interface III {
    int call(int n);
}


public class Main {
    static III F2 = (int x) -> x + 1;
    static III F1 = (int x) -> 2 * x + 1;
    static III F3 = (int x) -> 5 * x + 2;

    static III[] lambdasArray = {F1, F2, F3};

    static III[] methodsArray = {Main::m1, Main::m2, Main::m3};

    private static int m1(int i) {
        return i + 1;
    };

    private static int m2(int i) {
        return 2 * i + 1;
    };

    private static int m3(int i) {
        return 5 * i + 2;
    };

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Lambdas: ");
        for (III lambda: lambdasArray) {
            int randomNumber = random.nextInt(10);
            System.out.println(lambda.call(randomNumber));

        };


        System.out.println("Methods: ");
        for (III method: methodsArray) {
            int randomNumber = random.nextInt(10);
            System.out.println(method.call(randomNumber));
        };
    }
}