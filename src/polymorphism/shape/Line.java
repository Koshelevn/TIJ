package polymorphism.shape;
import static net.mindview.util.Print.*;
public class Line extends Shape {
    @Override public void draw() { print("Line.draw()"); }
    @Override public void erase() { print("Line.erase()"); }
    @Override public void fill() {print("fill Line");}
}
