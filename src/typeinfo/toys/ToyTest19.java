package typeinfo.toys;

import static net.mindview.util.Print.*;
import java.lang.reflect.*;

public class ToyTest19 {
    public static void main(String[] args) {
        // get appropriate constructor and create new instance:
        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(1);
            // catch four exceptions:
        } catch(NoSuchMethodException e) {
            print("No such method: " + e);
        } catch(InstantiationException e) {
            print("Unable make Toy: " + e);
        } catch(IllegalAccessException e) {
            print("Unable access: " + e);
        } catch(InvocationTargetException e) {
            print("Target invocation problem: " + e);
        }
    }
}