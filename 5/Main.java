// Вариант 1
// Напишите следующий метод, отыскивающий максимальное и минимальное
// значения в ArrayList. Метод возвращает другой ArrayList., состоящий из
// найденных двух элементов, расположенных в порядке убывания.
// public static ArrayList<Comparable> maxAndMin(ArrayList<Comparable>
// list)
// Если в исходном ArrayList меньше двух элементов функция выбрасывает
// исключение.
// Функция должна работать с любыми данными, реализующими интерфейс
// Comparable.
// Нужно протестировать функцию на данных системного типа (например,
// числа или строки) и данных собственного класса. В последнем случае класс
// должен реализовать интерфейс Comparable и иметь переопределённый
// метод compareTo().
// Вариант 2
// Пусть имеется следующий класс MyStack. Нужно реализовать в нем интерфейс
// Clonable и метод clone() так, чтобы он возвращал глубокую копию объекта (то
// есть самого стека). Протестировать работу стека, показать, что
// склонированный стек содержит собственный независимый ArrayList .
// import java.util.ArrayList;
// public class MyStack {
//  private ArrayList< Object> list = new ArrayList<>();
//  public boolean isEmpty() {
//  return list.isEmpty();
//  }
//  public int getSize() {
//  return list.size();
//  }
//  public Object peek() {
//  return list.get(getSize() - 1);
//  }
//  public Object pop() {
//  Object o = list.get(getSize() - 1);
//  list.remove(getSize() - 1);
//  return o;
//  }
//  public void push(Object o) {
//  list.add(o);
//  }
//  @Override /** Переопределяет метод toString класса Object */
//  public String toString() {
//  return "стек: " + list.toString();
//  }
// }
// УКАЗАНИЕ. Можно посмотреть дополнительные материалы с описанием
// стандартных интерфейсов Comparable и Clonable и базовых приёмов работы с
// ними – см. дополнительные материалы к заданию.
// Вот так нужно определить новый класс стека, чтобы он реализовал интерфейс
// Clonable
// class MyStack implements Cloneable {
// Вот так определяется метод стека clone()
// public Object clone() {
//  try {
//  MyStack c = (MyStack) super.clone();
//  c.list = (ArrayList<Object>) this.list.clone();
//  return c;
//  } catch (CloneNotSupportedException ex) {
//  return null;
//  }
//  }


import java.util.ArrayList;

public class Main {

    public static ArrayList<Comparable> maxAndMin(ArrayList<Comparable>list){
        ArrayList<Comparable> mass = new ArrayList<Comparable>();
        Comparable mx = list.get(0);
        Comparable mn = list.get(0);
        if(list.size()<2) return null;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).compareTo(mx)==1){
                mx = list.get(i);
            }
            if(list.get(i).compareTo(mn)==-1){
                mn = list.get(i);
            }
        }
        mass.add(0,mn);
        mass.add(1,mx);
        return mass;
    }

    public static void main(String[] args) {
        ArrayList<Comparable> st = new ArrayList<>();
        st.add(12);
        st.add(1);
        st.add(3);
        st.add(7);
        st.add(11);
        st.add(9);
        st.add(6);
        st.add(2);
        st.add(4);
        st.add(10);
        st.add(8);
        st.add(5);
        st.add(0);

        System.out.println(st.toString());
        System.out.println(maxAndMin(st));

        ArrayList<Comparable> st2 = new ArrayList<>();
        MyClass m1 = new MyClass(200, "Сыр");
        MyClass m2 = new MyClass(300, "Рулька");
        MyClass m3 = new MyClass(150, "Coca-Cola");
        MyClass m4 = new MyClass(40, "Хлеб");

        st2.add(m1);
        st2.add(m2);
        st2.add(m3);
        System.out.println(st2.toString());
        System.out.println(maxAndMin(st2));

        System.out.println("\n===================================================================");
        MyStack st3 = new MyStack();
        st3.push(m1);
        st3.push(m2);
        st3.push(m3);
        st3.push(m4);

        System.out.println(st3.toString());

        System.out.println(st3.pop().toString());
        System.out.println(st3.peek().toString());

        System.out.println(st3.toString());


    }
    }