package initialization;


public class OverloadedConstructors {
    OverloadedConstructors (){
        System.out.println("No-args");
    }
    OverloadedConstructors (int i){
        this();
    }

    public static void main(String[] args) {
        OverloadedConstructors o = new OverloadedConstructors(1);
    }
}
