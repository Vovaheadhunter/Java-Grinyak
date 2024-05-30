import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        System.out.println(time1.hour+ ":"+time1.minute+ ":"+ time1.second);

        MyTime time2 = new MyTime(555550000);
        System.out.println(time2.hour+ ":"+time2.minute+ ":"+ time2.second);

        MyTime time3 = new MyTime(5, 23, 55);
        System.out.println(time3.hour+ ":"+time3.minute+ ":"+ time3.second);

        time3.setTime(555550000);

        System.out.println(time3.hour+ ":"+time3.minute+ ":"+ time3.second);
        System.out.println(time3.GetHour()+ ":"+time3.GetMin()+ ":"+ time3.GetSec());

        Random random = new Random();
        int[] mass = random.ints(100000, 10,100000).toArray();
        StopWatch s1 = new StopWatch();
        s1.start();
        bubbleSort(mass);
        s1.stop();
        System.out.println("Время работы программы: "+s1.getElapsedTime());

        }
    public static void bubbleSort(int[] sortArr) {
        int swap;
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

}