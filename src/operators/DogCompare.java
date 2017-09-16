package operators;
import static net.mindview.util.Print.*;

public class DogCompare {
    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "Ruff!");
        Dog scruffy = new Dog("Scruffy", "Wurf!");
        print("Сравнение:");
        print("spot == scruffy: " + (spot==scruffy));
        print("spot.equals(scruffy): " + spot.equals(scruffy));
    }

}
