package transport;

/**
 * Переработать задачу про ГСМ с использование коллекций.
 * Добавить иерархию классов, а также провести переработку приложения с использованием коллекций
 */

//Родительский класс
public abstract class Transport {
    private final String type_transport;
    private final CODE_CAR code_car;
    private final Integer number_auto;
    private Integer probeg;

    public Transport(CODE_CAR code_car, int number_auto, int probeg) {
        this.code_car = code_car;
        type_transport = code_car.getTypeTransport();
        this.number_auto = number_auto;
        this.probeg = probeg;
    }

    public Integer getNumber_auto() {
        return number_auto;
    }

    public Integer getProbeg() {
        return probeg;
    }

    public void setProbeg(Integer probeg) {
        this.probeg = probeg;
    }

    @Override
    public String toString() {
        return " Код транспорта = " + code_car +
                " Тип транспорта = " +  type_transport +
                ", государственный номер = " + number_auto +
                ", пробег = " + probeg;
    }
}
