package transport;

public class Car extends Transport{
    private static final double FUEL_CONSUMPTION_PER_100_KM = 12.5;
    private static final double COSTS_OF_A_lITER_FUEL = 46.10;

    public Car(CODE_CAR code_car, int number_auto, int probeg) {
        super(code_car, number_auto, probeg);
    }

    public static double getFuelConsumptionPer100Km() {
        return FUEL_CONSUMPTION_PER_100_KM;
    }

    public static double getCostsOfAliterFuel() {
        return COSTS_OF_A_lITER_FUEL;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + super.toString();
    }
}
