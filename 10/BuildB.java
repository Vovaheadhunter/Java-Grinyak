import java.util.LinkedList;

public class BuildB extends Thread {
    private LinkedList<String> bB;
    private BuildC bC;
    private BuildD bD;

    public int BSize(){return bB.size();}

    public BuildB(LinkedList<String> bB, LinkedList<String> bC, LinkedList<String> bD){
        this.bB = bB;
        this.bC = new BuildC(bC);
        this.bD = new BuildD(bD);

    }

    @Override
    public String toString() {
        return "B"+ bB;
    }

    public void remB(){bB.removeFirst();}

    @Override
    public void run(){
        while(true){
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (bB){
                if(bC.CSize() != 0 && bD.DSize() != 0){
                    if(bB.size() < 5 ) {;
                        bC.remC();
                        bD.remD();
                        bB.add("B");
                    }
                }
            }

        }

    }
}
