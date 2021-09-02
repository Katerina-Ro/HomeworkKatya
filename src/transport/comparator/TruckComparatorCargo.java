package transport.comparator;

import transport.Truck;
import java.util.Comparator;

public class TruckComparatorCargo implements Comparator<Truck> {

        @Override
        public int compare(Truck o1, Truck o2) {
            if(o1.getVolume_of_transported_cargo() > o2.getVolume_of_transported_cargo()) return  1;
            else if(o1.getVolume_of_transported_cargo() < o2.getVolume_of_transported_cargo()) return  -1;
            else return 0;
        }
    }

