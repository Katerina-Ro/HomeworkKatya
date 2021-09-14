package transport.comparator;

import transport.Car;
import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getProbeg().compareTo(o2.getProbeg());
    }
}

