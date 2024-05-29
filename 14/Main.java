import java.util.Iterator;

class CustomData implements Comparable<CustomData> {
    private int value;

    public CustomData(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(CustomData other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return "CustomData{" +
                "value=" + value +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        sentence sentence = new sentence("Test sentence for this programm.");
        for (String word : sentence) {
            System.out.println(word);
        }



        // String переменная
        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.add("apple");
        stringStorage.add("banana");
        stringStorage.add("cherry");
        stringStorage.add("date");

        System.out.println("String storage forward iteration:");
        Iterator<String> stringIterator = stringStorage.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        } 

        

        // свой класс
        GenericStorage<CustomData> customDataStorage = new GenericStorage<>();
        customDataStorage.add(new CustomData(10));
        customDataStorage.add(new CustomData(5));
        customDataStorage.add(new CustomData(20));
        customDataStorage.add(new CustomData(15));

        System.out.println("Custom data storage forward iteration:");
        Iterator<CustomData> customDataIterator = customDataStorage.iterator();
        while (customDataIterator.hasNext()) {
            System.out.println(customDataIterator.next());
        }
    }
}
