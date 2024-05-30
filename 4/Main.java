import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape p1 = new Pyramid(5,3);
        Shape c1 = new Cylinder(6, 4);
        Shape b1 = new Ball(7);
        Box box1 = new Box(500);
        System.out.println(p1.toString());
        System.out.println(b1.toString());
        System.out.println(c1.toString());
        System.out.println(p1.getVolume()+" "+ c1.getVolume()+ " " + b1.getVolume());
        box1.add(p1);
        System.out.println(box1.toString());
        box1.add(c1);
        System.out.println(box1.toString());
        System.out.println(box1.add(b1));
        System.out.println("\n------------------------------------------------\n");

        ArrayList<Integer> st = new ArrayList<>();
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

        MyStack stack = new MyStack();
        for (int i = 0; i < st.size(); i++) {
            stack.push(st.get(i));
        }
        System.out.println(stack.toString());
        stack.sort();
        System.out.println(stack.toString());


    }

}