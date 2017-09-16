package strings;
import java.util.*;
public class Receipt {
    private int first[]= {-15, 5, 10};
    private float fl = 10.2f;
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void printTitle() {
        f.format("%" + first[0] +"s %" + first[1] + "s %" + first[2] + "s\n", "Item", "Qty", "Price");
        f.format("%" + first[0] +"s %" + first[1] + "s %" + first[2] + "s\n", "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format("%" + first[0] + "." + -first[0]+"s %" + first[1] +"d %" + fl + "f\n", name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format("%" + first[0] +"s %" + first[1] + "s %" + fl + "f\n", "Tax", "", total*0.06);
        f.format("%" + first[0] +"s %" + first[1] + "s %" + first[2] + "s\n", "", "", "-----");
        f.format("%" + first[0] +"s %" + first[1] + "s %" + fl + "f\n", "Total", "",
                total * 1.06);
    }
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}