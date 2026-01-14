package oops.inheritance;

public class Vehicles {

    String colors;

    void showColor() {
        System.out.println("Color: " + colors);
    }

    public static void main(String[] args) {

        Bikes b = new Bikes();
        b.colors = "Red";
        b.brands = "Yamaha";
        b.prices = 120000;
        b.displayBike();

        System.out.println();

        Car c = new Car();
        c.colors = "Black";
        c.brands = "Toyota";
        c.prices = 800000;
        c.displayCar();
    }
}

class Bikes extends Vehicles {
    String brands;
    double prices;

    void displayBike() {
        showColor();
        System.out.println("Bike Brand: " + brands);
        System.out.println("Bike Price: " + prices);
    }
}

class Car extends Vehicles {
    String brands;
    double prices;

    void displayCar() {
        showColor();
        System.out.println("Car Brand: " + brands);
        System.out.println("Car Price: " + prices);
    }
}
