package transport;

/**
 * Переработать задачу про ГСМ с использование коллекций.
 * Добавить иерархию классов, а также провести переработку приложения с использованием коллекций
 */

//Родительский класс
public class Transport {
    private String type_transport;
    private CODE_CAR code_car;
    private Integer number_auto;
    private Integer probeg;

    public Transport(){}

    public Transport(CODE_CAR code_car, int number_auto, int probeg) {
        this.code_car = code_car;
        type_transport = code_car.getTypeTransport();
        this.number_auto = number_auto;
        this.probeg = probeg;
    }

    public String getType_transport() {
        return type_transport;
    }

    public void setType_transport(String type_transport) {
        this.type_transport = type_transport;
    }

    public CODE_CAR getCode_car() {
        return code_car;
    }

    public void setCode_car(CODE_CAR code_car) {
        this.code_car = code_car;
    }

    public Integer getNumber_auto() {
        return number_auto;
    }

    public void setNumber_auto(Integer number_auto) {
        this.number_auto = number_auto;
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
