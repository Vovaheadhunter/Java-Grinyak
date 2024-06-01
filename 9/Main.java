// Вариант 1
// Опишите класс с потоковой функцией, выводящей на экран ID потока, а затем с новой
// строки – текстовую строку, переданную в конструктор класса (она будет храниться как
// поле данных класса, строка должна быть достаточно большой, например, представлять
// собой отрывок из известного классического или современного текста). Напишите
// программу, которая создаёт несколько потоков (5 - 10). Каждый из созданных потоков
// выводит свой текст. При этом вывод текста синхронизирован (следующий текст не
// выводится, пока не закончится вывод предыдущего). Этого можно добиться, например,
// пометив метод, выводящий текст на консоль как synchronized.
// Вариант 2
// Написать программу со следующей функциональностью:
// Главный поток программы должен считывать вводимые пользователем строки и
// помещать их в конец списка ArrayList. Строки длиннее 80 символов можно разрезать на
// несколько строк. Если пользователь вводит пустую строку – программа останавливается и
// выводит на консоль текущее состояние списка. Дочерний поток пробуждается каждые
// пять секунд и сортирует получившийся список строк в лексикографическом порядке
// (используйте любую сортировку). Все операции над списком должны синхронизоваться
// при помощи synchronized.


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