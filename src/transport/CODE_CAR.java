package transport;

public enum CODE_CAR {
    C100 ("Легковой"), C200 ("Грузовой"), C300 ("Пассажирский"), C400 ("Тяжелая техника (краны)");
    private final String typeTransport;

    CODE_CAR (String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public String getTypeTransport() {return typeTransport;}
}
