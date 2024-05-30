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