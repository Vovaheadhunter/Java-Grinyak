import java.util.LinkedList;

public class Product extends Thread{
    private LinkedList<String> list;
    private BuildA qA;
    private BuildB qB;
    private BuildC qC;
    private BuildD qD;
    private String prod;

    public Product(LinkedList<String> list, LinkedList<String> bA, LinkedList<String> bB, LinkedList<String> bC, LinkedList<String> bD)
    {
        this.list = list;
        this.qA = new BuildA(bA);
        this.qB = new BuildB(bB, bC, bD);
        this.qC = new BuildC(bC);
        this.qD = new BuildD(bD);

    }

    @Override
    public String toString() {
        return "продуктов "+ list.size();
    }

    @Override
    public void run(){
        while (true) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (list){
                if(qB.BSize()!=0 && qA.ASize()!=0){
                    qA.remA();
                    qB.remB();
                    list.add("продукт");

            }

            }
        }

    }
}
