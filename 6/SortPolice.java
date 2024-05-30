import java.util.Comparator;

public class SortPolice implements Comparator<Car> {
    public int compare(Car c1, Car c2){
        if(c1.getPriority() < c2.getPriority()) return 1;
        else if(c1.getPriority() > c2.getPriority()) return -1;
        return 0;
    }
}
