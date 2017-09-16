package strings;

public class Ex7 {
    public static String sentence = "Sasdasdsad.";

    public static void main(String[] args) {
        System.out.println(sentence.matches("\\p{Upper}[A-Za-z,;'\"\\s]+."));
    }
}
