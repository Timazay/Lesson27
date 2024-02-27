package by.itstep.lesson27.task02.model.entity;

public class Car {
    private String brand;
    private double power;
    private double tank;

    public Car() {
    }

    public Car(String brand, double power, double tank) {
        this.brand = brand;
        this.power = power;
        this.tank = tank;
    }

    public String getBrand() {
        return brand;
    }

    public double getPower() {
        return power;
    }

    public double getTank() {
        return tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", tank=" + tank +
                '}';
    }
}
