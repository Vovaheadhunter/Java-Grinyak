// Вариант 1
// Измените класс GenericStack таким образом, чтобы реализовать его с
// помощью массива, а не ArrayList. Перед добавлением нового элемента в стек
// необходимо проверить размер массива. Если массив заполнен, создайте
// новый массив, который удвоит текущий размер массива и скопирует
// элементы из текущего массива в новый.
// public class GenericStack<E> {
//  private java.util.ArrayList<E> list = new java.util.ArrayList<>();
//  public int getSize() {
//  return list.size();
//  }
//  public E peek() {
//  return list.get(getSize() - 1);
//  }
//  public void push(E o) {
//  list.add(o);
//  }
//  public E pop() {
//  E o = list.get(getSize() - 1);
//  list.remove(getSize() - 1);
//  return o;
//  }
//  public boolean isEmpty() {
//  return list.isEmpty();
//  }

//  @Override
//  public String toString() {
//  return "стек: " + list.toString();
//  }
// }
// Указание: объявить массив можно, например, следующим образом:
// private E[] arr = (E[]) new Object[SIZE];
// Вариант 2
// Возьмите класс-дженерик класс GenericStack из варианта 1. Напишите метод,
// которому передается коллекция объектов типа ArrayList и добавляется в
// конец стека, но так, чтобы отбрасывались значения-дубликаты. Для поиска и
// удаления дубликатов необходимо использовать метод contains() интерфейса
// List.

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GenericStack arr = new GenericStack();
        arr.push(0);
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);
        arr.push(6);
        arr.push(7);
        System.out.println(arr.getSize());
        arr.push(8);
        arr.push(9);
        System.out.println(arr.getMaxSize());
        arr.push(10);
        arr.push(11);
        System.out.println(arr);
        System.out.println(arr.isEmpty());
        System.out.println(arr.peek());
        arr.pop();
        System.out.println(arr);
        System.out.println(arr.getMaxSize());

        ArrayList list = new ArrayList<>();
        list.add(12);
        list.add(10);
        list.add(13);
        list.add(8);
        list.add(22);
        arr.addArr(list);
        System.out.println(arr);
        }
    }
