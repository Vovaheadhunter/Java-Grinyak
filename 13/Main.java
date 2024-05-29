import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        LongStr str1 = (String s1, String s2) -> {
            String max = "";
            if (s1.length() > s2.length()) {
                max = s1;
            } else if (s1.length() < s2.length()) {
                max = s2;
            } else max = s1;
            return max;
        };
        Checker ch1 = (int x) -> {
            if (x%13==0){
                return true;
            }
            return false;
        };
        try (BufferedReader reader = new BufferedReader(new FileReader("пример текст.txt", Charset.forName("utf-8")))) {
            String line;
            String line2;
            String answer = "";
            while ((line = reader.readLine()) != null) {
                if (((line2 = reader.readLine()) != null) && (answer.length() < str1.pre(line, line2).length()))
                    answer = str1.pre(line, line2);
            }
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("пример числа.txt", Charset.forName("utf-8")))) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ответ вариант 2.txt"));

            String line;
            int num;
            while ((line = reader.readLine()) != null) {
                num = Integer.parseInt(line);

                if (ch1.eqthr(num)) writer.write(line+"\n");
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
interface LongStr {
    String pre(String s1, String s2);
}

interface Checker{
    boolean eqthr(int x);
}