package initialization;

class Dog{
   void bark(int i){
       System.out.println("barkbark");
    }
    void bark(float f){
        System.out.println("slurkslutrk");
    }
    void bark(boolean b){
        System.out.println("boolbool");
    }
    void bark(short s){
        System.out.println("shortshort");
    }
    void bark(long l){
        System.out.println("longlong");
    }
}
public class DogTalk {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(1);
        d.bark(2l);
        d.bark(1.2f);
        d.bark((short) 3);
        d.bark(true);

    }
}
