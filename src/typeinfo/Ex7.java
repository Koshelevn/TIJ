package typeinfo;

public class Ex7 {
    public static void main(String[] args) {
        for(String arg : args){
            System.out.println(arg);
            if(arg.equals("Gum")) new Gum();
            if (arg.equals("Cookie")) new Cookie();
            if (arg.equals("Candy")) new Candy();
        }
    }
}
