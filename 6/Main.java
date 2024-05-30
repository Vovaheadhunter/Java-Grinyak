import java.util.Collections;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 2);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(6, 7);
        Fraction f4 = new Fraction(11, 9);
        Fraction f5 = new Fraction(-12, 8);
        ArrayList<Fraction> list = new ArrayList<Fraction>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        Collections.sort(list,new SortPlus());
        System.out.println("Сортировка по возрастанию: "+list);
        Collections.sort(list,new SortFloor());
        System.out.println("Сортировка по убыванию: "+list);
        Collections.sort(list,new SortAbsUp());
        System.out.println("Сортировка по возрастанию абсолютных значений: "+list);
        Collections.sort(list,new SortAbsFloor());
        System.out.println("Сортировка по возрастанию абсолютных значений: "+list);
        System.out.println("===============================================================");

        Car c1 = new Car("А456ОК125", 1);
        Car c3 = new Car("Л233ОК125", 2);
        Car c4 = new Car("С901УП125", 1);
        Car c5 = new Car("В232СР125", 1);
        Car c6 = new Car("Д603ЖС125", 3);
        Car c7 = new Car("Х666ХХ125", 1);
        PriorityQueue<Car> list1 = new PriorityQueue<>(new SortPolice());
        list1.add(c1);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);
        list1.add(c6);
        list1.add(c7);
        System.out.println(list1);

        PriorityQueue<Car> list2 = new PriorityQueue<>(new SortMedic());
        list2.add(c1);
        list2.add(c3);
        list2.add(c4);
        list2.add(c5);
        list2.add(c6);
        list2.add(c7);
        System.out.println(list2);
        }
    }