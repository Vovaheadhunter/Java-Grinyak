public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(){
        radius = 5;
        height = 4;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (radius*radius*3.14*height);
    }

    @Override
    public double getRaduis() {
        return (radius);
    }

    @Override
    public String toString() {
        return "Объём цилиндра с R = "+getRaduis()+", h = "+ height+ ", равен: "+ getVolume();
    }
}
