package typeinfo;

import java.util.*;
abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    void rotate() {
        if (!(this instanceof Circle))
            System.out.println(this + " is rotating");
    }
    void hightlight(Shape shape){
        if (shape instanceof Circle) Circle.hightlighted=true;
        if (shape instanceof Square) Square.hightlighted=true;
        if (shape instanceof Triangle) Triangle.hightlighted=true;
    }
    abstract public String toString();
}
class Circle extends Shape {
    static boolean hightlighted = false;
    public String toString() { return Boolean.toString(hightlighted) + " Circle"; }
}
class Square extends Shape {
    static boolean hightlighted = false;
    public String toString() { return Boolean.toString(hightlighted) + " Square"; }
}
class Triangle extends Shape {
    static boolean hightlighted = false;
    public String toString() { return Boolean.toString(hightlighted) + " Triangle"; }
}
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for(Shape shape : shapeList) {
            shape.hightlight(shape);
            System.out.println(shape);
        }
    }
}