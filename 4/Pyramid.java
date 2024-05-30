public class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(){
        s = 10;
        h = 3;
    }

    public Pyramid(double s, double h){
        this.s = s;
        this.h = h;
    }

    public double getVolume(){
        return((s*h)/3);
    }

    @Override
    public String toString() {
        return "Объём пирамиды, где S = "+s+", H = "+h+" равен: "+ getVolume();
    }
}
