import java.util.LinkedList;

public class BuildC extends Thread{
    private LinkedList<String> bC;

    public BuildC(){
        bC = bC;
    }
    public BuildC(LinkedList<String> bC){
        this.bC = bC;
    }

    public int CSize(){return bC.size();}

    @Override
    public String toString() {
        return "C"+ bC;
    }

    public void remC(){
        bC.removeFirst();
    }

    @Override
    public void run(){
        while (true){
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (bC){
                if (bC.size() < 5) bC.add("C");
            }
        }


    }

}
