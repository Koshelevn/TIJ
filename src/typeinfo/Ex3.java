package typeinfo;
import typeinfo.Shapes.*;
class Rhomboid extends Shape{
    @Override
    public String toString() {
        return "Rhomboid";
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Shape shape = new Rhomboid();
        ((Shape)shape).draw();
        System.out.println(shape instanceof Circle);
    }
}
