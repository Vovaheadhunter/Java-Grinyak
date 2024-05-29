public class MyThread extends Thread{
    private String str;

    public MyThread(){
        str = "NO TEXT!";
    }

    public MyThread(String str){
        this.str = str;
    }

    public void print(){
        synchronized (System.out){
        System.out.println("ID потока: " + Thread.currentThread().getId());
        System.out.println(str);}
    }

    @Override
    public void run(){
        print();
    }
}
