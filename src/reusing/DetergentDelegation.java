package reusing;


import static net.mindview.util.Print.print;

public class DetergentDelegation {
    Cleanser c = new Cleanser();
    private String s = "Cleanser";
    public void append(String a) {  s+= a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() {
        append(" Detergent.scrub()");
        c.scrub(); // Call base-class version
    }
    public void foam() { append(" foam()"); }
    public String toString() { return s; }

    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
    }
}
