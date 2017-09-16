package exceptions;

/**
 * Created by koshe on 14.07.2017.
 */
public class Ex2 {
    public static void main(String[] args) {
        Ex1 ex1 = null;
        try {
            ex1.hashCode();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
