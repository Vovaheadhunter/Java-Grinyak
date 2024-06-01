// Вариант 1
// Нужно описать класс Предложение. В конструктор этого класса передаётся текстовая строка.
// Реализовать итератор для этого класса так, чтобы он перебирал слова в предложении.
// Вариант 2
// Реализовать класс-дженерик для хранения данных любого типа. Данные должны храниться,
// например, в поле типа ArrayList<Т>.
// Реализовать для этого класса итератор таким образом, чтобы он обходил элементы в порядке
// их добавления. При этом итератор должен быть двунаправленным и кольцевым (то есть при
// достижении последнего элемента снова переходим к первому). Кроме того, итератор
// обходит только элементы больше или равные первому элементу, если попадается элемент
// меньше – он игнорируется и происходит переход к следующему.
// Продемонстрировать работу итератора на встроенном типе данных (например, String) и
// собственном типе данных, реализовав в нём нужные интерфейсы

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
