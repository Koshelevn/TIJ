package generics;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Random;

class Load{
    private long id;
    private String name;
    private int count;
    public Load(int id, String name, int count){
        this.count=count;
        this.id=id;
        this.name=name;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return (id + ": " + count + " of " + name);
    }
    public static Generator<Load> generator (){
        Random random = new Random();
        return new Generator<Load>() {
            @Override
            public Load next() {
                return new Load(random.nextInt(1000), "TestName", random.nextInt(100));
            }
        };
    }
}
class Container extends ArrayList<Load>{
    private long id;
    public Container(int nLoads){
        Generators.fill(this, Load.generator(), nLoads);
    }
}
class Tower extends ArrayList<Container>{
    public Tower(int nContainers, int nLoads){
        for (int i=0; i <nContainers; i++)
           add(new Container(nLoads));
    }
}
public class CargoShip19 extends ArrayList<Tower>{
    public CargoShip19(int nTowers, int nContainers, int nLoads){
        for (int i=0; i<nTowers; i++)
            add(new Tower(nContainers,nLoads));
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Tower a : this)
            for(Container s : a)
                for (Load p : s) {
                    result.append(p);
                    result.append("\n");
            }
        return result.toString();
    }

    public static void main(String[] args) {
        CargoShip19 cargo = new CargoShip19(5,10,5);
    }
}
