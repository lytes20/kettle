import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        ConnectionPool instanceOne = ConnectionPool.getPool();
        ConnectionPool instanceTwo= null;

        try{
            Constructor[] constructors =  ConnectionPool.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instanceTwo = (ConnectionPool) constructor.newInstance();
                break;
            }
        }catch (Exception e){
            e.printStackTrace();

        }
        System.out.println(instanceOne.getClass().getName()+ " with hashCode: "+ instanceOne.hashCode());
        System.out.println(instanceTwo.getClass().getName()+ " with hashcode: "+ instanceTwo.hashCode());

    }
}
