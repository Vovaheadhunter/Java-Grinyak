public class MyString2 {
    char [] s = {};
    public MyString2(char[] chars){
        s = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            s[i]=chars[i];
        }
    }
    public MyString2 substring(int begin){
        char[] su = new char[s.length-begin];
        for (int i = begin; i < s.length; i++){
            su[i-begin]=s[i];
        }
        MyString2 su2 = new MyString2(su);
        return su2;
    }
    public MyString2 substring(int begin, int end){
        char [] su = new char[end - begin];
        for(int i = begin; i < end; i++){
            su[i-begin]=s[i];
        }
        MyString2 su2 = new MyString2(su);
        return(su2);
    }

    public int compareTo(MyString2 obj){
        if(s.length > obj.s.length) return -1;
        if(s.length < obj.s.length) return 1;
        for(int i = 0; i < s.length; i++){
            if(s[i] != obj.s[i]){
                if(s[i]>obj.s[i]) return 1;
                else return 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (compareTo((MyString2) obj) == 0) return true;
        return false;
    }

    public char[] toChars(){
        return s;
    }

    public static MyString2 valueOf(boolean b){
        char[] su = new char[5];
        if(b) su = "true".toCharArray();
        if(!b) su = "false".toCharArray();
        MyString2 su2 = new MyString2(su);
        return su2;
    }
}
