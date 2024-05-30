public class ContainerFull extends Exception{
    private int size;
    public ContainerFull(int size){
        super("В массиве может быть только "+size+" элементов!");
        this.size = size;
    }
}
