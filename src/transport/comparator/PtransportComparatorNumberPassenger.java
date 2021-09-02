package transport.comparator;

import transport.PassangerTransport;
import java.util.Comparator;

public class PtransportComparatorNumberPassenger implements Comparator<PassangerTransport> {
    @Override
    public int compare(PassangerTransport o1, PassangerTransport o2) {
        if(o1.getNumber_of_passengers_carried() > o2.getNumber_of_passengers_carried()) return  1;
        else if(o1.getNumber_of_passengers_carried() < o2.getNumber_of_passengers_carried()) return  -1;
        else return 0;
    }
}
