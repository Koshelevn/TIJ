package object;


public class StorageTest {
    static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        System.out.println(storage("asd"));
    }
}
