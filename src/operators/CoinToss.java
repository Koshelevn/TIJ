package operators;
import java.util.*;

public class CoinToss {
    public static void main(String[] args) {
        Random random = new Random(47);
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(2) + 1;
            if (i == 1) System.out.println("Орёл");
            else System.out.println("Решка");
        }
    }
}
