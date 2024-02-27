package by.itstep.lesson27.task02.controller;

import by.itstep.lesson27.task02.model.entity.Bus;
import by.itstep.lesson27.task02.model.entity.Car;
import by.itstep.lesson27.task02.model.entity.Truck;
import by.itstep.lesson27.task02.model.logic.GasStation;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Scania", 50, 480);
        Bus bus2 = new Bus("MAN", 55, 520);

        Car car1 = new Car("BMW", 120, 90);
        Car car2 = new Car("Scoda", 115, 45);
        Car car3 = new Car("Honda", 250, 65);

        Truck truck1 = new Truck("Iveco", 12000, 28, 800);

        Bus[] buses = {bus1, bus2};
        Car[] cars = {car1, car2, car3};
        Truck[] trucks = {truck1};

        double total = GasStation.calcTotalGas(cars, buses, trucks);

        System.out.println("Total gas: " + total);
    }
}
