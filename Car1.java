// Class definition
class Car1 {
    // Attributes
    private String model;
    private String color;
    private int year;

    // Constructor
    public Car1(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car1 myCar = new Car("Toyota Camry", "Red", 2021);

        // Displaying the details of the car
        myCar.displayDetails();
    }
}