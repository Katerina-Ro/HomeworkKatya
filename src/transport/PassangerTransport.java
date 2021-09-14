package transport;

public class PassangerTransport extends Transport {
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

    @Override
    public String toString() {
        return "Пассажирский транспорт: " +
                super.toString() + " Число перевезенных пассажиров = " + number_of_passengers_carried;
    }
}
