import java.util.ArrayList;
public class MyStack{
    private ArrayList< Object> list = new ArrayList<>();
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int getSize() {
        return list.size();
    }

    public Object peek() {
        Object o = list.get(getSize() - 1);
            try {
                if (o instanceof Cloneable) {
                    Object o1 = o.getClass().getMethod("clone").invoke(o);
                    return o1;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return o;
    }
    public Object pop() {
        Object o = list.get(getSize() - 1);
        try{
            if (o instanceof Cloneable){
                Object o1 = o.getClass().getMethod("clone").invoke(o);
                list.remove(getSize() - 1);
                return o1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        list.remove(getSize() - 1);
        return o;
    }
    public void push(Object o) {
        list.add(o);
    }
    @Override /** Переопределяет метод toString класса Object */
    public String toString() {
        return "стек: " + list.toString();
    }
}