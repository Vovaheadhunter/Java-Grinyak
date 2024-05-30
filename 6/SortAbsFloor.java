import java.util.Comparator;

public class SortAbsFloor implements Comparator<Fraction> {
    public int compare(Fraction f1, Fraction f2){
        if (Math.abs(f1.doubleValue()) < Math.abs(f2.doubleValue())) return -1;
        else if (Math.abs(f1.doubleValue()) > Math.abs(f2.doubleValue())) return 1;
        return 0;
    }
}
