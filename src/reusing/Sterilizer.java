package reusing;


public class Sterilizer extends Detergent{
    @Override
    public void scrub() {
        append(" Sterilizer.scrub()");
    }
    public void sterilize(){
        append(" Sterilizer.sterilize()");
    }

    public static void main(String[] args) {
        Sterilizer sterilizer = new Sterilizer();
        sterilizer.dilute();
        sterilizer.apply();
        sterilizer.scrub();
        sterilizer.foam();
        sterilizer.sterilize();
        System.out.println(sterilizer);
    }
}
