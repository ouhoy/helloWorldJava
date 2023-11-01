// This is a Java class named 'Car' that represents information about a car.

public class Car {

    // These two instance variables store the car's color and brand.
    String carColor;
    String carBrand;

    // This method returns a string representation of the car.
    public String toString() {
        // It combines the car's brand and color to form a description.
        return "the car is " + carBrand + " and its color is " + carColor;
    }

    // This is the constructor for the 'Car' class, which initializes its properties.
    public Car(String brand, String color) {
        // It assigns the provided brand and color to the corresponding instance variables.
        carColor = color;
        carBrand = brand;
    }

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Two 'Car' objects, 'carOne' and 'carTwo', are created and initialized with different values.
        Car carOne = new Car("fiat", "red");
        Car carTwo = new Car("BMW", "black");

        // The toString() method is implicitly called when you use 'System.out.println()',
        // so it prints a description of each car.
        System.out.println(carOne);
        System.out.println(carTwo);
    }
}
