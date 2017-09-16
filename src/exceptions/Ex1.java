package exceptions;


public class Ex1 {
    public static void main(String[] args) {
        try {
            throw new Exception("String");
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Here");
        }
    }
}
