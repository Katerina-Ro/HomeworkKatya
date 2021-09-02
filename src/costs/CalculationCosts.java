package costs;

import transport.*;

public interface CalculationCosts {

    default double CarFuelConsumptionPer1Km() {
        return Car.getFuelConsumptionPer100Km()/ 100;
    }

    default double TruckFuelConsumptionPer1Km() {
        return Truck.getFuelConsumptionPer100Km()/ 100;
    }

    default double PasTransFuelConsumptionPer1Km() {
        return PassangerTransport.getFuelConsumptionPer100Km()/ 100;
    }

    default double CranesFuelConsumptionPer1Km() {
        return Cranes.getFuelConsumptionPer100Km()/ 100;
    }

    double calculationFuelCostsCar(Car c);
    double calculationFuelCostsTruck(Truck t);
    double calculationFuelCostsPassengerTransport(PassangerTransport pt);
    double calculationFuelCostsCranes(Cranes cr);
}
