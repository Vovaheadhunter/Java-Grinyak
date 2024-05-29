import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] strs = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et",
                "dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip",
                "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore",
                "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia",
                "deserunt mollit anim id est laborum."};

        MyThread[] threads = new MyThread[strs.length];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(strs[i]);
            threads[i].start();
        }


        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        SortThread thread = new SortThread(arr);
        thread.start();
        String st;
        while (!(st=in.nextLine()).equals("")){
            arr.add(st);
        }
        System.out.println(arr);
    }
}