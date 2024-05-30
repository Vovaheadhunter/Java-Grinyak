public class Сont {
    private int size;
    private int [] arr;

    public Сont(){
        this.arr = new int[10];
        this.size=0;
    }

    public int search(int number) throws SearchException{
        int count = 0;
        int index = 0;
        for (int i = 0; i < size; i++){
            if(arr[i] == number){
                count++;
                index = i;
            }
            if (count > 1){
                throw new SearchException("В массиве имеется больше 1 элемента с таким значением!", 1);
            }
        }
        return index;
    }

    public void sort() throws SortException{
        if(size == 0){
            throw new SortException("Невозможно отсортировать массив состоящий из 0 элементов!", 1);
        }
        boolean option = false;
        for (int i = 0; i < this.size - 1; i++) {
            if (this.arr[0] != this.arr[i+1]) {
                option = true;
                break;
            }
        }
        if (option == false) throw new SortException("Нельзя чтобы все элементы стека были равны!", 2);

        int temp;
        for (int i = 0; i < this.size-1; i++) {
            for (int j = i+1; j < this.size; j++) {
                if (this.arr[i] > this.arr[j]) {
                    temp = this.arr[i];
                    this.arr[i] = this.arr[j];
                    this.arr[j] = temp;
                }
            }
        }
    }

    public void push(int o) throws ContainerFull{
        if (size == 10){
            throw new ContainerFull(size);
        }
        arr[size] = o;
        size+=1;
    }

    public void pop() throws ContainerEmpty{
        if(size == 0){
            throw new ContainerEmpty();
        }
        arr[size - 1] = 0;
        size--;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0 ; i < size; i++){
            if (i != size-1) string+=arr[i]+", ";
            else string+=arr[i];
        }
        return "стек: " + string;
    }
}
