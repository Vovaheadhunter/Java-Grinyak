import java.io.Serializable;

public class Author implements Serializable {

    private static final long serialVersionUID = 1L;
    private String lastname;
    private String ini;

    public Author(String lastname, String ini){
        this.lastname = lastname;
        this.ini = ini;
    }

    @Override
    public String toString() {
        return lastname+ini;
    }
}
