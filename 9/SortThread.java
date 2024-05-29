import java.util.ArrayList;
import java.util.Collections;

public class SortThread extends Thread{
    private ArrayList<String> st;

    public SortThread(ArrayList<String> st){
        this.st = st;
    }

    public void Sort() throws InterruptedException {
        synchronized (st) {
            while (true){
                Thread.sleep(5000);
                Collections.sort(st);
            }
        }
    }

    @Override
    public void run(){
        try {
            Sort();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
