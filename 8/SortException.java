public class SortException extends Exception{
    private int num;
    public SortException(String message, int num){
        super(message);
        this.num = num;
    }

    public int getNumber(){
        return this.num;
    }
}
