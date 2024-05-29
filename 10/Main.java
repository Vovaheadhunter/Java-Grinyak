import java.util.LinkedList;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> bA = new LinkedList<>();
        LinkedList<String> bB = new LinkedList<>();
        LinkedList<String> bC = new LinkedList<>();
        LinkedList<String> bD = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();

        BuildA qA = new BuildA(bA);
        BuildB qB = new BuildB(bB, bC, bD);
        BuildC qC = new BuildC(bC);
        BuildD qD = new BuildD(bD);
        Product li = new Product(list,bA,bB,bC,bD);

        qA.start();
        qB.start();
        qC.start();
        qD.start();
        li.start();

        while (true) {
            sleep(1000);
            System.out.println(li);
            System.out.println(qA);
            System.out.println(qB);
            System.out.println(qC);
            System.out.println(qD);
            System.out.println("\n");
        }

        // LinkedList<Patient> p = new LinkedList<>();
        // p.add(new Patient("Павел Фамусов", 6));
        // p.add(new Patient("Софья Павловна", 4));
        // p.add(new Patient("Лизонька", 8));
        // p.add(new Patient("Алексей Молалин", 9));
        // p.add(new Patient("Александр Чацкий", 5));
        // p.add(new Patient("Сергей Скалозуб", 4));
        // p.add(new Patient("Репетилов", 2));


        // Nurse n1 = new Nurse("Печорин", p);
        // Nurse n2 = new Nurse("Вулич", p);
        // Nurse n3 = new Nurse("Максим Максимыч", p);

        // n1.start();
        // n2.start();
        // n3.start();
    }
}