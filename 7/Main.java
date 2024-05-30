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
