// Вариант 1
// Опишите класс Fraction, представляющий собой обыкновенную дробь: класс
// включает в себя целые элементы-данные numerator (числитель) и
// denominator (знаменатель). Реализуйте в классе интерфейс Comparable, так,
// чтобы можно было упорядочивать дроби по возрастанию.
// Реализуйте компаратор для упорядочивания дробей так, чтобы можно было
// бы упорядочивать дроби одним из четырёх способов: по возрастанию, по
// убыванию, по возрастанию абсолютных значений, по убыванию абсолютных
// значений.
// Продемонстрируйте работу функционала на примере сортировки дробей
// методом Collections.sort().
// Вариант 2
// PriorityQueue - это очередь с приоритетом, которая по умолчанию размещает
// элементы согласно естественному порядку сортировки. Для сортировки здесь
// используется Comparable и Comparator.
// Смоделируйте с помощью класса-дженерика PriorityQueue следующую
// задачу. Пусть имеется класс автомобиль. Для каждого автомобиля определен
// один из возможных приоритетов – обычный, служебный (полиция),
// медицинский. Машины подъезжают к заправке (помещаются в очередь с
// приоритетом). Вначале заправляются (извлекаются из приоритетной
// очереди) машины с наибольшим приоритетом.
// Реализуйте два варианта компаратора для определения приоритета
// автомобилей. В первом случае высший приоритет - у медицинского
// автомобиля, во втором – у полиции.
// Дополнительное задание. Реализуйте функционал таким образом, чтобы
// учитывалась также очерёдность поступления автомобилей в очередь. В
// общем случае при наличии в приоритетной очереди элементов с одинаковым
// приоритетом они будут извлекаться из неё в произвольном порядке, не
// связанным с порядком занесения в очередь. 


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