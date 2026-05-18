import java.io.Serializable;

public class Connection implements Serializable {
    public void open(){
        System.out.println("Open connection to DB");
    }
}
