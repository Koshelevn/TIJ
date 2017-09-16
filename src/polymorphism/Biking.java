package polymorphism;

class Cycle {
    void ride(Cycle cycle){
        System.out.println("Ride " + cycle.getClass().getSimpleName() + " Wheels: " + wheels(cycle));
    }
    int wheels (Cycle cycle){
        switch (cycle.getClass().getSimpleName()){
            default:
            case "Unicycle" : return 1;
            case "Bicycle" : return 2;
            case "Tricycle" : return 3;
        }
    }
}
class Unicycle extends Cycle{

}
class Bicycle extends Cycle{

}
class Tricycle extends Cycle{

}
public class Biking {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        cycle.ride(new Unicycle());
        cycle.ride(new Bicycle());
        cycle.ride(new Tricycle());
    }
}
