public class Car implements Comparable<Car>{
    private String number;
    private int priority;

    public Car(){
        number = "NULL";
        priority = 1;
    }

    public Car(String number, int priority){
        this.number = number;
        this.priority = priority;
    }

    public String getNumber(){return number;}

    public int getPriority(){return priority;}

    @Override
    public String toString(){return number + '['+priority+']';}

    @Override
    public int compareTo(Car o) {
        if (o.getPriority() > this.priority) return 1;
        else if (o.getPriority() < this.priority) return -1;
        return 0;
    }
}
