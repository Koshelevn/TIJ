package control;


import java.util.Random;

public class SwitchTest {
    public static void main(String[] args) {
        Random random = new Random(47);
        for (int j = 0; j<=10; j++) {
            int i = random.nextInt(5) + 1;
            switch (i) {
                case 1:
                    System.out.println("one");
                 //   break;
                case 2:
                    System.out.println("two");
                 //   break;
                case 3:
                    System.out.println("three");
                 //   break;
                case 4:
                    System.out.println("four");
                 //   break;
                case 5:
                    System.out.println("five");
                 //   break;
                default:
                    System.out.println("Default");
            }
        }
    }
}
