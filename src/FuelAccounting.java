import costs.FuelCosts;
import transport.CODE_CAR;
import transport.*;
import transport.comparator.*;
import java.util.*;

public class FuelAccounting {
    static String[] array = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
    static List<Car> cars = new ArrayList<>();
    static List<Truck> trucks = new ArrayList<>();
    static List<PassangerTransport> passangerTransports = new ArrayList<>();
    static List<Cranes> cranes = new ArrayList<>();

     public static void main(String[] args) {
         //Перемещаем данные из строкового массива в списки по каждому виду транспорта
         for (String s : array) {
            int firstIndex_ = s.indexOf("_");
            String codeCar = s.substring(0, firstIndex_); //получили параметр code_car
            CODE_CAR codeCars = CODE_CAR.valueOf(codeCar);

            int firstindex = s.indexOf("-");
            int secondindex = s.lastIndexOf("-");

            Integer number_transport = Integer.valueOf(s.substring(firstIndex_ + 1, firstindex));  //получили параметр  number_auto для передачи в элемент (объект) списка
            int param2 = 0; //получили дополнительный параметр для передачи в элемент (объект) списка
            Integer probegCar; //получили параметр probeg (пробег) для передачи в элемент (объект) списка
            if (secondindex == firstindex) {
                probegCar = Integer.valueOf(s.substring(firstindex + 1));
            } else {
                probegCar = Integer.valueOf(s.substring(firstindex + 1, secondindex));
                param2 = Integer.parseInt(s.substring(secondindex + 1));
            }

            //Заполняем списки элементами (объектами)
            switch (codeCars) {
                case C100:
                    if (!cars.isEmpty()) {
                        int i = 0;
                        while (true) {
                            if (number_transport.equals(cars.get(i).getNumber_auto())) {
                                probegCar = cars.get(i).getProbeg() + probegCar;
                                cars.get(i).setProbeg(probegCar);
                            } else {
                                cars.add(new Car(codeCars, number_transport, probegCar));
                            }
                            break;
                        }
                    } else {
                        cars.add(new Car(codeCars, number_transport, probegCar));
                    }
                    break;
                case C200:
                    if (!trucks.isEmpty()) {
                        int i = 0;
                        while (true) {
                            if (number_transport.equals(trucks.get(i).getNumber_auto())) {
                                probegCar = trucks.get(i).getProbeg() + probegCar;
                                trucks.get(i).setProbeg(probegCar);

                                param2 = trucks.get(i).getVolume_of_transported_cargo() + param2;
                                trucks.get(i).setVolume_of_transported_cargo(param2);
                            } else {
                                trucks.add(new Truck(codeCars, number_transport, probegCar, param2));
                            }
                            break;
                        }
                    } else {
                        trucks.add(new Truck(codeCars, number_transport, probegCar, param2));
                    }
                    break;
                case C300:
                    if (!passangerTransports.isEmpty()) {
                        int i = 0;
                        while (true) {
                            if (passangerTransports.get(i).getNumber_auto().equals(number_transport)) {
                                probegCar = passangerTransports.get(i).getProbeg() + probegCar;
                                passangerTransports.get(i).setProbeg(probegCar);

                                param2 = passangerTransports.get(i).getNumber_of_passengers_carried() + param2;
                                passangerTransports.get(i).setNumber_of_passengers_carried(param2);
                            } else {
                                passangerTransports.add(new PassangerTransport(codeCars, number_transport, probegCar, param2));
                            }
                            break;
                        }
                    } else {
                        passangerTransports.add(new PassangerTransport(codeCars, number_transport, probegCar, param2));
                    }
                    break;
                case C400:
                    if (!cranes.isEmpty()) {
                        int i = 0;
                        while (true) {
                            if (cranes.get(i).getNumber_auto().equals(number_transport)) {
                                probegCar = cranes.get(i).getProbeg() + probegCar;
                                cranes.get(i).setProbeg(probegCar);

                                param2 = cranes.get(i).getWeight_of_lifted_loads() + param2;
                                cranes.get(i).setWeight_of_lifted_loads(param2);
                            } else {
                                cranes.add(new Cranes(codeCars, number_transport, probegCar, param2));
                            }
                            break;
                        }
                    } else {
                        cranes.add(new Cranes(codeCars, number_transport, probegCar, param2));
                    }
                    break;
            }
        }

        // Получаем стоимость расходо на ГСМ
        FuelCosts fuelCosts = new FuelCosts();

        // стоимость расходов на ГСМ на легковой автомобиль
        double totalCar = 0.0;
        for (Car c : cars) {
            totalCar += fuelCosts.calculationFuelCostsCar(c);
        }
        System.out.println("Стоимость расходов на ГСМ на легковой автомобиль " + totalCar);

        // стоимость расходов на ГСМ на грузовой автомобиль
        double totalTruck = 0.0;
        for (Truck t : trucks) {
            totalTruck += fuelCosts.calculationFuelCostsTruck(t);
        }
        System.out.println("Стоимость расходов на ГСМ на грузовики " + totalTruck);

        // стоимость расходов на ГСМ на пассажирский транспорт
        double totalPassangerTransport = 0.0;
        for (PassangerTransport pt : passangerTransports) {
            totalPassangerTransport += fuelCosts.calculationFuelCostsPassengerTransport(pt);
        }
        System.out.println("Стоимость расходов на ГСМ на пассажирский транспорт " + totalPassangerTransport);

        //стоимость расходов на тяжелую технику (краны)
        double totalCranes = 0.0;
        for (Cranes cr : cranes) {
            totalCranes += fuelCosts.calculationFuelCostsCranes(cr);
        }
        System.out.println("Стоимость расходов на ГСМ на тяжелую технику " + totalCranes);
        System.out.println();

        //общая стоимость расходов ГСМ по всем видам транспорта
        System.out.println("Общая стоимость расходов ГСМ по всем видам транспорта = " + (totalCar + totalCranes + totalTruck + totalPassangerTransport));
        System.out.println();

        //Получаем тип транспорта наибольшего и наименьшего значений
        List<Double> listValueCosts = new ArrayList<>();
        listValueCosts.add(totalCar);
        listValueCosts.add(totalTruck);
        listValueCosts.add(totalPassangerTransport);
        listValueCosts.add(totalCranes);

        Double maxValueCosts = Collections.max(listValueCosts);
        String type_transport_max;
        if (maxValueCosts == totalCar) {
            type_transport_max = CODE_CAR.C100.getTypeTransport();
        } else if (maxValueCosts == totalTruck) {
            type_transport_max = CODE_CAR.C200.getTypeTransport();
        } else if (maxValueCosts == totalPassangerTransport) {
            type_transport_max = CODE_CAR.C300.getTypeTransport();
        } else {
            type_transport_max = CODE_CAR.C400.getTypeTransport();
        }
        System.out.println("Тип авто, имеющий наибольшую стоимость расходов, - это " + type_transport_max);

        Double minValueCosts = Collections.min(listValueCosts);
        String type_transport_min;
        if (minValueCosts == totalCar) {
            type_transport_min = CODE_CAR.C100.getTypeTransport();
        } else if (minValueCosts == totalTruck) {
            type_transport_min = CODE_CAR.C200.getTypeTransport();
        } else if (minValueCosts == totalPassangerTransport) {
            type_transport_min = CODE_CAR.C300.getTypeTransport();
        } else {
            type_transport_min = CODE_CAR.C400.getTypeTransport();
        }
        System.out.println("Тип авто, имеющий наименьшую стоимость расходов, - это " + type_transport_min);
        System.out.println();

        //Выводим информацию о транспорте по запросу с консоли
        Scanner in = new Scanner(System.in);
        System.out.println("Какой вид транспорта вас интересует: легковой, грузовой, пассажирский, тяжелая техника?");
        getInfoTransport(in.nextLine());
        in.close();
    }
            /**
             * реализовать функции которые в разрезе каждого типа авто выводят информацию о каждом авто
             * (тип, номер, пробег, доп. параметр), с сортировкой по пробегу и доп параметру
             **/
    public static void getInfoTransport(String console_input) {
        if (console_input.equalsIgnoreCase(CODE_CAR.C100.getTypeTransport())) {
                Comparator<Car> comparator = new CarComparator();
                cars.sort(comparator);
                for (Transport p : cars) {
                    System.out.println(p);
                }
        }
        else if (console_input.equalsIgnoreCase(CODE_CAR.C200.getTypeTransport())) {
            Comparator<Truck> comparator = new TruckComparatorProbeg().thenComparing(new TruckComparatorCargo());
            trucks.sort(comparator);
            for (Transport p : trucks) {
                System.out.println(p);
            }
        }
        else if (console_input.equalsIgnoreCase(CODE_CAR.C300.getTypeTransport())) {
            Comparator<PassangerTransport> comparator = new PTransportComparatorProbeg().thenComparing(new PtransportComparatorNumberPassenger());
            passangerTransports.sort(comparator);
            for (Transport p : passangerTransports) {
                System.out.println(p);
            }
        }
        else {
            Comparator<Cranes> comparator = new CranesComparatorProbeg().thenComparing(new CranesComparatorWeight());
            cranes.sort(comparator);
            for (Transport p : cranes) {
                System.out.println(p);
            }
        }
    }
}






