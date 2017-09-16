package interfaces;

interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("ride Unicycle");
    }
}
class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
class Bicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("ride Bicycle");
    }
}
class BicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("ride Tricycle");
    }
}
class TricycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
public class Cycles {
    public static void ride(CycleFactory factory){
        Cycle c = factory.getCycle();
        c.ride();
    }
    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
        ride(new TricycleFactory());

    }
}
