package control;


public class IfEsleTest {
    static int test(int num, int begin, int end) {
        if((num >= begin) && (num<=end))
            return +1;
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(test(8,5,10));
        System.out.println(test(3,4,7));
        System.out.println(test(8,5,6));
    }
}
