import java.util.ArrayList;
public class MyStack {
    private ArrayList<Comparable> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Comparable o) {
        list.add(o);
    }

    @Override
    /** Переопределяет метод toString класса Object */
    public String toString() {
        return "стек: " + list.toString();
    }

    public void sort(){
        Comparable pr;
        for(int i = 0; i < getSize(); i++){
            for(int j = i+1; j < getSize(); j++){
                if(list.get(i).compareTo(list.get(j))==1){
                    pr = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,pr);
                }
            }
        }
    }
}
