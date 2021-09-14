package transport;

public class Car extends Transport {

    public Car(CODE_CAR code_car, int number_auto, int probeg) {
        super(code_car, number_auto, probeg);
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + super.toString();
    }
}
