public class Ball extends SolidOfRevolution{

    public Ball(){
        radius = 3;
    }

    public Ball(double raduis){
        this.radius = raduis;
    }

    @Override
    public double getVolume() {
        return ((4*3.14*radius*radius*radius)/3);
    }

    @Override
    public double getRaduis() {
        return radius;
    }

    @Override
    public String toString(){
        return "Шар с R = "+ getRaduis() +" имеет объем равный "+ getVolume();
    }
}
