public class Main {
    public static void main(String[] args) {
        Сont arr = new Сont();
        Сont arr2 = new Сont();
        Сont arr3 = new Сont();
        try {
            for (int i = 0; i < 11; i++) {
                try {
                    arr.push(i);
                }
                catch (ContainerFull ex) {
                    System.out.println(ex);
                    break;
                }
            }
            System.out.println(arr);
            arr.pop();
            System.out.println(arr);
            arr2.pop();
        }
        catch (ContainerEmpty ex) {
            System.out.println(ex);
        }
        try{
            arr.push(-1);
            arr3.push(2);
            arr3.push(2);
            arr3.push(2);
            arr3.sort();
        }catch(ContainerFull |SortException ex){
            System.out.println(ex);
        }
        try{
            arr.sort();
            System.out.println(arr);
            arr2.sort();
        }
        catch(SortException ex){
            System.out.println(ex);
        }

        try{
            System.out.println("Индекс искомого элемента равен: "+arr.search(6));
            System.out.println(arr3.search(2));
        }
        catch (SearchException ex){
            System.out.println(ex);
        }
    }
}