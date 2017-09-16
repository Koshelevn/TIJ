package initialization;

class Str{
    Str(String s){
        System.out.println(s);
    }
}
public class InitTest17 {
    public static void main(String[] args) {
        Str[] s = new Str[]{new Str("123"), new Str("321")};
    }
}
