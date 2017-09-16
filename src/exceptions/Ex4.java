package exceptions;

class MyEx extends Throwable{
    String string;
    MyEx(String string){
        this.string = string;
    }
    void show(){
        System.out.println(this.string);
    }
}
public class Ex4 {
    public static void main(String[] args) {
        try {
            throw new MyEx("String");
        } catch (MyEx e){
            e.show();
        }
    }
}
