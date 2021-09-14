package transport;

public class Cranes extends Transport {
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

    @Override
    public String toString() {
        return "Тяжелая техника: " +
                super.toString() +
               " Вес поднятых грузов = " + weight_of_lifted_loads;
    }
}
