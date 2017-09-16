package exceptions;

/**
 * Created by koshe on 14.07.2017.
 */
public class Ex3 {
    public static void main(String[] args) {
        char[] chars = new char[1];
        try {
            chars[2] = 0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
