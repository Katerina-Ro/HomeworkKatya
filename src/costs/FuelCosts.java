package costs;

import transport.*;

//Класс содердит информацию о расчетах расходов на топливо

public class FuelCosts implements CalculationCosts {
    private double cost_of_expenses_for_fuel_transport;

    public FuelCosts() {}

    //расчет стоимости расходов на ГСМ по каждому виду транспорта
    @Override
    public double calculationFuelCostsCar(Car c) {
        cost_of_expenses_for_fuel_transport = c.getProbeg() * CarFuelConsumptionPer1Km() * Car.getCostsOfAliterFuel();
        return cost_of_expenses_for_fuel_transport;
            }

    @Override
    public double calculationFuelCostsTruck(Truck t){
        cost_of_expenses_for_fuel_transport = t.getProbeg() * TruckFuelConsumptionPer1Km() * Truck.getCostsOfAliterFuel();
        return cost_of_expenses_for_fuel_transport;
    }

    @Override
    public double calculationFuelCostsPassengerTransport(PassangerTransport pt){
        cost_of_expenses_for_fuel_transport = pt.getProbeg() * PasTransFuelConsumptionPer1Km() * PassangerTransport.getCostsOfAliterFuel();
        return cost_of_expenses_for_fuel_transport;
    }

    @Override
    public double calculationFuelCostsCranes(Cranes cr){
        cost_of_expenses_for_fuel_transport = cr.getProbeg() * CranesFuelConsumptionPer1Km() * Cranes.getCostsOfAliterFuel();
        return cost_of_expenses_for_fuel_transport;
    }
}
