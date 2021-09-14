package transport;

public class Truck extends Transport {
    private int volume_of_transported_cargo;

    public Truck(CODE_CAR code_car, int number_auto, int probeg, int volume_of_transported_cargo) {
        super(code_car, number_auto, probeg);
        this.volume_of_transported_cargo = volume_of_transported_cargo;
    }

    public int getVolume_of_transported_cargo() {
        return volume_of_transported_cargo;
    }

    public void setVolume_of_transported_cargo(int volume_of_transported_cargo) {
        this.volume_of_transported_cargo = volume_of_transported_cargo;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: " +
                super.toString() +
                " Объем перевезенного груза = " + volume_of_transported_cargo;
    }
}
