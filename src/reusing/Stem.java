package reusing;

class Component1{
    Component1(){
        System.out.println("Component1");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3");
    }
}
class Root{
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    Root(){
        System.out.println("Root");
    }
}
public class Stem extends Root{
    Stem(){
        System.out.println("Stem");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
