package transport.comparator;

import transport.Cranes;
import java.util.Comparator;

public class CranesComparatorProbeg implements Comparator<Cranes> {
    @Override
    public int compare(Cranes o1, Cranes o2) {
        return o1.getProbeg().compareTo(o2.getProbeg());
    }
}

