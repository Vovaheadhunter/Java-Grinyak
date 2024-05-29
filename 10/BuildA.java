import java.util.LinkedList;

public class BuildA extends Thread{
    private LinkedList<String> bA;

    public int ASize(){return bA.size();}

    public BuildA(LinkedList<String> bA){
        this.bA = bA;
    }

    @Override
    public String toString() {
        return "A"+bA;
    }

    public void remA() {bA.removeFirst();}

    @Override
    public void run(){
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (bA){
                if (bA.size() < 5) bA.add("A");
            }

        }
    }


}
