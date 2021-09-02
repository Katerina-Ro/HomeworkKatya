package transport;

public class PassangerTransport extends Transport{
    private static final double FUEL_CONSUMPTION_PER_100_KM = 11.5;
    private static final double COSTS_OF_A_lITER_FUEL = 47.50;
    private int number_of_passengers_carried;

    public PassangerTransport(CODE_CAR code_car, int number_auto, int probeg, int number_of_passengers_carried) {
        super(code_car, number_auto, probeg);
        this.number_of_passengers_carried = number_of_passengers_carried;
    }

    public int getNumber_of_passengers_carried() {
        return number_of_passengers_carried;
    }

    public void setNumber_of_passengers_carried(int number_of_passengers_carried) {
        this.number_of_passengers_carried = number_of_passengers_carried;
    }

    public static double getFuelConsumptionPer100Km() {
        return FUEL_CONSUMPTION_PER_100_KM;
    }

    public static double getCostsOfAliterFuel() {
        return COSTS_OF_A_lITER_FUEL;
    }

    @Override
    public String toString() {
        return "Пассажирский транспорт: " +
                super.toString() + " Число перевезенных пассажиров = " + number_of_passengers_carried;
    }
}
