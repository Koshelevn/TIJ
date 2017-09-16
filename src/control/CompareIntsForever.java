package control;

import java.util.Random;

public class CompareIntsForever {
    public static void main(String[] args) {
        Random r1 = new Random(47);
        Random r2 = new Random(48);
        while (true){
            int num1 = r1.nextInt(100);
            int num2 = r1.nextInt(100);
            if (num1 > num2)
                System.out.println(num1 + ">" + num2);
            else if (num1 < num2)
                System.out.println(num1 + "<" + num2);
            else if (num1 == num2)
                System.out.println(num1 + "=" + num2);
        }
    }
}
