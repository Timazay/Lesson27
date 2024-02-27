package by.itstep.lesson27.task02.model.entity;

public class Vehicle {
    private String brand;
    private double tank;

    public Vehicle() {
    }

    public Vehicle(String brand, double tank) {
        this.brand = brand;
        this.tank = tank;
    }

    public String getBrand() {
        return brand;
    }

    public double getTank() {
        return tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "brand='" + brand +
                ", tank=" + tank;
    }
}
