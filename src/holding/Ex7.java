package holding;

import java.util.ArrayList;
import java.util.List;
import static net.mindview.util.Print.*;
class Exp{
    int num;
    static int key=0;
    Exp(){
        key++;
        this.num=key;
    }
}
public class Ex7 {
    public static void main(String[] args) {
        List<Exp> exps = new ArrayList<Exp>();
        for(int i = 0; i<10; i++){
            exps.add(new Exp());
        }
        List<Exp> sub = exps.subList(3,7);
        exps.removeAll(sub);
        for(Exp exp:exps){
            System.out.print(exp.num + " ");
        }
    }
}
