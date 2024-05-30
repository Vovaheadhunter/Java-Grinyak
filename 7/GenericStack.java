import java.util.ArrayList;


public class GenericStack<E> {
    private int SIZE;
    private E[] arr;

    public GenericStack(){
        arr = (E[]) new Object[10];
        SIZE = 0;
    }

    public void addArr(ArrayList <E> list){
        boolean stat = false;
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < arr.length; j++){
                stat = list.contains(arr[j]);
                if (stat && list.get(i) == arr[j]) {
                    stat = true;
                    break;
                }
            }
            if(!stat) {
                push(list.get(i));
            }


        }
    }

    public int getSize() {
        return SIZE;
    }

    public int getMaxSize(){
        return arr.length;
    }
    public E peek() {
        return arr[getSize()-1];
    }
    public void push(E o) {
        if (arr.length == SIZE){
            E[] arr2 = (E[]) new Object[SIZE*2];
            for (int i = 0; i < SIZE; i++){
                arr2[i] = arr[i];
            }
            arr = (E[]) new Object[SIZE*2];
            for (int i = 0; i < SIZE; i++){
                arr[i] = arr2[i];
            }
        }
        arr[SIZE] = o;
        SIZE+=1;
    }
    public E pop() {
        E o = arr[SIZE-1];
        arr[SIZE-1] = null;
        return o;
    }
    public boolean isEmpty() {
        return SIZE == 0;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0 ; i < getSize(); i++){
            if (i != SIZE-1) string+=arr[i]+", ";
            else string+=arr[i];
        }
        return "стек: " + string;
    }
}
