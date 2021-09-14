package transport.comparator;

import transport.PassangerTransport;
import java.util.Comparator;

public class PTransportComparatorProbeg implements Comparator<PassangerTransport> {

    @Override
    public int compare(PassangerTransport o1, PassangerTransport o2) {
        return o1.getProbeg().compareTo(o2.getProbeg());
    }
}
