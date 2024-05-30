public class SearchException extends Exception{
    private int num;

    public SearchException(String message, int num){
        super(message);
        this.num = num;
    }

    public int getNubmer(){
        return this.num;
    }
}
