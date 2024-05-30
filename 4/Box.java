import java.util.ArrayList;
public class Box extends Shape{

    private double v;

    private double cv;

    private ArrayList<Shape> mass;

    public Box(){
        v=500;
        cv = 0;
        mass = new ArrayList<>();
    }

    public Box(double v){
        this.v = v;
        this.cv = 0;
        mass = new ArrayList<>();
    }

    public boolean add(Shape fig){
        double figvol;
        figvol = fig.getVolume();
        if (v - cv < figvol) return false;
        else mass.add(fig);
        cv +=figvol;
        return true;
    }

    public double getVolume(){
        return cv;
    }

    @Override
    public String toString() {
        return "Объем коробки равен: " + getVolume();
    }
}
