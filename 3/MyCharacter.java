public class MyCharacter {
    char v;

    public MyCharacter(char value) {
        v = value;
    }

    public char charValue() {
        return v;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        if (v == anotherCharacter.v) return 0;
        if (v > anotherCharacter.v) return 1;
        else return -1;
    }

    public boolean isDigit() {
        return Character.isDigit(v);
    }

    public boolean equals(Object anotherCharacter) {
        if (this == anotherCharacter) return true;
        if (v == ((MyCharacter) anotherCharacter).v) return true;
        else return false;
    }

    public static boolean isDigit(MyCharacter ch){
        return Character.isDigit(ch.v);
    }

    public static boolean isLetter(MyCharacter ch){
        return Character.isLetter(ch.v);
    }

    public static boolean isLetterOrDigit(MyCharacter ch){
        if(Character.isDigit(ch.v)) return true;
        else return Character.isLetter(ch.v);
    }
}
