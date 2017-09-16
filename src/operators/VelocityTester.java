package operators;

class calc {
    private int distance;
    private int time;

    public int velocity(){
        return distance/time;
    }
    public void setDistance(int speed) {
        this.distance = speed;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
public class VelocityTester {
    public static void main(String[] args) {
        calc a = new calc();
        a.setDistance(100);
        a.setTime(10);
        System.out.println(a.velocity());
    }
}
