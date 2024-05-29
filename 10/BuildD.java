import java.util.LinkedList;

public class BuildD extends Thread{
    private LinkedList<String> bD;

    public BuildD(){
        bD = bD;
    }

    public BuildD(LinkedList<String> bD){
        this.bD = bD;
    }

    public int DSize(){return bD.size();}

    @Override
    public String toString() {
        return "D"+ bD;
    }

    public void remD(){bD.removeFirst();}

    @Override
    public void run(){
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (bD){
                if (bD.size() < 5) bD.add("D");
            }
        }

    }
}
