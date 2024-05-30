//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyCharacter v1 = new MyCharacter('5');
        MyCharacter v2 = new MyCharacter('b');
        MyCharacter v3 = new MyCharacter('*');

        System.out.println("Значение v1: "+v1.charValue()+ ", Значение v2: "+ v2.charValue());

        System.out.println("Проверка метода compareTo: "+v1.compareTo(v2));

        System.out.println(v1.v +" это число? "+ v1.isDigit()+", а "+ v2.v +" это чиcло? "+v2.isDigit());

        System.out.println("Проверка функции equals v1 и v2: "+v1.equals(v2));

        System.out.println("Проверка функции isDigit c v1 = "+v1.v+": "+MyCharacter.isDigit(v1));
        System.out.println("Проверка функции isDigit c v2 = "+v2.v+": "+MyCharacter.isDigit(v2));

        System.out.println("Проверка функции isLetter c v2 = "+v2.v+": "+MyCharacter.isLetter(v2));
        System.out.println("Проверка функции isLetter c v1 = "+v1.v+": "+MyCharacter.isLetter(v1));

        System.out.println("Проверка функции isLetterOrDigit c v1 = "+v1.v+": "+MyCharacter.isLetterOrDigit(v1));
        System.out.println("Проверка функции isLetterOrDigit c v2 = "+v2.v+": "+MyCharacter.isLetterOrDigit(v2));
        System.out.println("Проверка функции isLetterOrDigit c v3 = "+v3.v+": "+MyCharacter.isLetterOrDigit(v3));

        MyString2 s1 = new MyString2("USSR".toCharArray());
        MyString2 s2 = new MyString2("Russian Federation".toCharArray());
        MyString2 s3 = new MyString2("USSR".toCharArray());
        System.out.println("\n");
        System.out.println(s1.s);
        System.out.println(s2.s);
        System.out.println("\n");

        // проверка substring(int begin)
        MyString2 su = s2.substring(8);
        System.out.println(su.s);
        System.out.println("\n");

        // проверка substring(int begin, int end)
        MyString2 su2 = s2.substring(8, 9);
        System.out.println(su2.s);

        // проверка compareTo
        System.out.println("\n"+s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s1));
        System.out.println("\n");

        // проверка equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("\n");

        // проверка toChars
        char[] pr = s1.toChars();
        System.out.println(pr);
        System.out.println("\n");

        // проверка valueOf
        boolean b = true;
        MyString2 ts = MyString2.valueOf(b);
        System.out.println(ts.s);
        MyString2 ts2 = MyString2.valueOf(!b);
        System.out.println(ts2.s);

        }
    }