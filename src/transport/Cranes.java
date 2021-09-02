package transport;

public class Cranes extends Transport{
    private static final double FUEL_CONSUMPTION_PER_100_KM = 20.0;
    private static final double COSTS_OF_A_lITER_FUEL = 48.90;
    private int weight_of_lifted_loads;

    public Cranes(CODE_CAR code_car, int number_auto, int probeg, int weight_of_lifted_loads) {
        super(code_car, number_auto, probeg);
        this.weight_of_lifted_loads = weight_of_lifted_loads;
    }

    public int getWeight_of_lifted_loads() {
        return weight_of_lifted_loads;
    }

    public void setWeight_of_lifted_loads(int weight_of_lifted_loads) {
        this.weight_of_lifted_loads = weight_of_lifted_loads;
    }

    public static double getFuelConsumptionPer100Km() {
        return FUEL_CONSUMPTION_PER_100_KM;
    }

    public static double getCostsOfAliterFuel() {
        return COSTS_OF_A_lITER_FUEL;
    }

    @Override
    public String toString() {
        return "Тяжелая техника: " +
                super.toString() +
               " Вес поднятых грузов = " + weight_of_lifted_loads;
    }
}
