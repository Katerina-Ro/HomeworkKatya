package costs;

import transport.*;

public interface CalculationCosts{

    //расчет стоимости расходов на ГСМ на 1 км по каждому виду транспорта
    static double CarFuelConsumptionPer1Km() {
        return new FuelCosts().getFUEL_CONSUMPTION_PER_100_KM_CAR()/ 100;
    }

    static double TruckFuelConsumptionPer1Km() {
        return new FuelCosts().getFUEL_CONSUMPTION_PER_100_KM_TRUCK()/ 100;
    }

    static double PasTransFuelConsumptionPer1Km() {
        return new FuelCosts().getFUEL_CONSUMPTION_PER_100_KM_PASSENGER_TRANSORT()/ 100;
    }

    static double CranesFuelConsumptionPer1Km() {
        return new FuelCosts().getFUEL_CONSUMPTION_PER_100_KM_CRANES()/ 100;
    }

    //расчет стоимости расходов на ГСМ по каждому виду транспорта
    default double calculationFuelCostsCar(Car c) {
        FuelCosts fc = new FuelCosts();
       fc.setCost_of_expenses_for_fuel_transport(c.getProbeg() * CarFuelConsumptionPer1Km() * fc.getCOSTS_OF_A_lITER_FUEL_CAR());
        return fc.getCost_of_expenses_for_fuel_transport();
    }

    default double calculationFuelCostsTruck(Truck t) {
        FuelCosts fc = new FuelCosts();
        fc.setCost_of_expenses_for_fuel_transport(t.getProbeg() * TruckFuelConsumptionPer1Km() * fc.getCOSTS_OF_A_lITER_FUEL_TRUCK());
        return fc.getCost_of_expenses_for_fuel_transport();
    }

    default double calculationFuelCostsPassengerTransport(PassangerTransport pt) {
        FuelCosts fc = new FuelCosts();
        fc.setCost_of_expenses_for_fuel_transport(pt.getProbeg() * PasTransFuelConsumptionPer1Km() * fc.getCOSTS_OF_A_lITER_FUEL_PASSENGER_TRANSORT());
        return fc.getCost_of_expenses_for_fuel_transport();
    }

    default double calculationFuelCostsCranes(Cranes cr) {
        FuelCosts fc = new FuelCosts();
        fc.setCost_of_expenses_for_fuel_transport(cr.getProbeg() * CranesFuelConsumptionPer1Km() * fc.getCOSTS_OF_A_lITER_FUEL_CRANES());
        return fc.getCost_of_expenses_for_fuel_transport();
    }
}
