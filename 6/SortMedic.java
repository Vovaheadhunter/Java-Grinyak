import java.util.Comparator;

public class SortMedic implements Comparator<Car> {

    public int compare(Car c1, Car c2){

        int p1,p2;
        if(c1.getPriority() == 2) p1 = 3;
        else if(c1.getPriority() == 3) p1 = 2;
        else p1=1;
        if(c2.getPriority() == 2) p2 = 3;
        else if(c2.getPriority() == 3) p2 = 2;
        else p2=1;

        if(p1 > p2) return -1;
        else if(p1 < p2) return 1;
        return 0;
    }
}
