public class MyClass implements Comparable<MyClass> {
    private int price;
    private String name;

    public MyClass(){
        price = 0;
        name = "NULL";
    }

    public MyClass(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " Цена: "+ price;
    }

    @Override
    public int compareTo(MyClass o) {
        if( price > o.price ) return 1;
        else if (price < o.price) return -1;
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (super.clone());
    }

}
