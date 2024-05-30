import java.util.Comparator;

public class SortPlus implements Comparator<Fraction> {
    public int compare(Fraction f1, Fraction f2){
        if (f1.doubleValue() < f2.doubleValue()) return 1;
        else if (f1.doubleValue() > f2.doubleValue()) return -1;
        return 0;
    }
}
