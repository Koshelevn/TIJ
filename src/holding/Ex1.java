package holding;

import java.util.ArrayList;

class Gerbil{
    String GebrilName;
    Gerbil(String GebrilName){
        this.GebrilName=GebrilName;
    }
    void hop(){
        System.out.println(this.GebrilName + " hoping");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil("Mike"));
        gerbils.add(new Gerbil("Rose"));
        gerbils.add(new Gerbil("Jhon"));
        for (int i=0; i<3; i++){
            gerbils.get(i).hop();
        }
    }
}
