package transport.comparator;

import transport.Truck;
import java.util.Comparator;

public class TruckComparatorProbeg implements Comparator<Truck> {
    @Override
    public int compare(Truck o1, Truck o2) {
        return o1.getProbeg().compareTo(o2.getProbeg());
    }
}
