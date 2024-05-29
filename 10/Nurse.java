import java.util.LinkedList;

public class Nurse extends Thread{
    private String name;
    private LinkedList<Patient> patients;

    public Nurse(String name, LinkedList<Patient> patients){
        this.name = name;
        this.patients = patients;
    }

    @Override
    public void run() {
        while(!patients.isEmpty()){
            Patient p;
            synchronized (patients){
                p = patients.removeFirst();
            }
            System.out.println(">> Медсестра "+name+", обслуживает пациента "+p.getName()+" "+p.getTime()+" минут.");
            try {
                sleep(p.getTime()*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Медсестра "+name+", обслужила "+p.getName()+" за "+p.getTime()+" минут.");

        }

    }
}
