package CarRentalSystem;


import java.security.PublicKey;

class Car{
    private String Model;

    private String Brand;

    private boolean isAvailable;

    private int Id;

    private double basePrice;

    public Car(String model, String brand, boolean isAvailable, int id, double basePrice) {
        Model = model;
        Brand = brand;
        this.isAvailable = isAvailable;
        Id = id;
        this.basePrice = basePrice;
    }

    public String getModel() {
        return Model;
    }

    public String getBrand() {
        return Brand;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getId() {
        return Id;
    }

    public double getBasePrice() {
        return basePrice;
    }
}

class Customer {
    private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}


class Rent{

    private Car car;

    private Customer customer;

    private int days;

    public Rent(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}

class CarRentalsystem{


}
public class CARSystem {
    public static void main(String[] args) {

    }
}
