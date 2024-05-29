//import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        sentence sentence = new sentence("Предложение для проверки работы программы.");
        for (String word : sentence) {
            System.out.println(word);
        }



        // GenericContainer<String> container = new GenericContainer<>();
        // container.add("apple");
        // container.add("banana");
        // container.add("cherry");
        // container.add("date");

        // Iterator<String> iterator = container.iterator();
        // for (int i = 0; i < 8; i++) { // Loop to demonstrate circular iteration
        //     if (iterator.hasNext()) {
        //         System.out.println(iterator.next());
        //     }
        // }
    

    }
}
