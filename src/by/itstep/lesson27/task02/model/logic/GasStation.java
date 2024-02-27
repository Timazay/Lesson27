package by.itstep.lesson27.task02.model.logic;

import by.itstep.lesson27.task02.model.entity.Vehicle;

public class GasStation {
    public static double calcTotalGas(Vehicle[] vehicles) {
        double total = 0;

        for (Vehicle car : vehicles) {
            total += car.getTank();
        }

        return total;
    }
}
