package costs;

//Класс содержит информацию о расходах на топливо
public class FuelCosts implements CalculationCosts {
    private static final double COSTS_OF_A_lITER_FUEL_PASSENGER_TRANSORT = 47.50;
    private static final double COSTS_OF_A_lITER_FUEL_CRANES = 48.90;
    private static final double COSTS_OF_A_lITER_FUEL_CAR = 46.10;
    private static final double COSTS_OF_A_lITER_FUEL_TRUCK = 48.90;

    private static final double FUEL_CONSUMPTION_PER_100_KM_TRUCK = 12;
    private static final double FUEL_CONSUMPTION_PER_100_KM_PASSENGER_TRANSORT = 11.5;
    private static final double FUEL_CONSUMPTION_PER_100_KM_CRANES = 20;
    private static final double FUEL_CONSUMPTION_PER_100_KM_CAR = 12.5;

    private double cost_of_expenses_for_fuel_transport;

    public FuelCosts() {}

    public double getCOSTS_OF_A_lITER_FUEL_PASSENGER_TRANSORT() {
        return COSTS_OF_A_lITER_FUEL_PASSENGER_TRANSORT;
    }

    public double getCOSTS_OF_A_lITER_FUEL_CRANES() {
        return COSTS_OF_A_lITER_FUEL_CRANES;
    }

    public double getCOSTS_OF_A_lITER_FUEL_CAR() {
        return COSTS_OF_A_lITER_FUEL_CAR;
    }

    public double getCOSTS_OF_A_lITER_FUEL_TRUCK() {
        return COSTS_OF_A_lITER_FUEL_TRUCK;
    }

    public double getFUEL_CONSUMPTION_PER_100_KM_TRUCK() {
        return FUEL_CONSUMPTION_PER_100_KM_TRUCK;
    }

    public double getFUEL_CONSUMPTION_PER_100_KM_PASSENGER_TRANSORT() {
        return FUEL_CONSUMPTION_PER_100_KM_PASSENGER_TRANSORT;
    }

    public double getFUEL_CONSUMPTION_PER_100_KM_CRANES() {
        return FUEL_CONSUMPTION_PER_100_KM_CRANES;
    }

    public double getFUEL_CONSUMPTION_PER_100_KM_CAR() {
        return FUEL_CONSUMPTION_PER_100_KM_CAR;
    }

    public double getCost_of_expenses_for_fuel_transport() {
        return cost_of_expenses_for_fuel_transport;
    }

    public void setCost_of_expenses_for_fuel_transport(double cost_of_expenses_for_fuel_transport) {
        this.cost_of_expenses_for_fuel_transport = cost_of_expenses_for_fuel_transport;
    }
}
