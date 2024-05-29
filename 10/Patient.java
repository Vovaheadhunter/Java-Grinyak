public class Patient {
    private String name;
    private int time;

    public Patient(){
        name = "NO";
        time = 0;
    }

    public Patient(String name, int time){
        this.name = name;
        this.time = time;
    }

    public int getTime(){return time;}
    public String getName(){return name;}



}
