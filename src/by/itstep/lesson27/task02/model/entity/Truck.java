package by.itstep.lesson27.task02.model.entity;

public class Truck {
    private String brand;
    private double volume;
    private double weight;
    private double tank;

    public Truck() {
    }

    public Truck(String brand, double volume, double weight, double tank) {
        this.brand = brand;
        this.volume = volume;
        this.weight = weight;
        this.tank = tank;
    }

    public String getBrand() {
        return brand;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public double getTank() {
        return tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", weight=" + weight +
                ", tank=" + tank +
                '}';
    }
}
