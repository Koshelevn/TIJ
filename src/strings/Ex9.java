package strings;

public class Ex9 {
    public static void main(String[] args) {
        String knights = Splitting.knights;
        System.out.println(knights.replaceAll("[aeiou]","_"));

    }
}
