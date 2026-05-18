import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        ConnectionPool instance1 = ConnectionPool.getPool();

        try{
            ObjectOutput out  = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instance1);
            out.close();


            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            ConnectionPool instance2 = (ConnectionPool) in.readObject();
            in.close();

            System.out.println("instance1 hashCode: "+ instance1.hashCode());
            System.out.println("instance2 hashCode: "+ instance2.hashCode());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
