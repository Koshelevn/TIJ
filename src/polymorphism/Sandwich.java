package polymorphism;

import static net.mindview.util.Print.*;
interface Fastfood{
    void eat();
}
class Meal {
    Meal() { print("Meal()"); }
}
class Bread {
    Bread() { print("Bread()"); }
}
class Cheese {
    Cheese() { print("Cheese()"); }
}
class Lettuce {
    Lettuce() { print("Lettuce()"); }
}
class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}
class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}
public class Sandwich extends PortableLunch implements Fastfood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() { print("Sandwich()"); }
    @Override
    public void eat() {
     System.out.println("eat");
    }
    public static void main(String[] args) {
        new Sandwich();
    }
}
