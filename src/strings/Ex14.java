package strings;

import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) {
        String string = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(string.split("!!")));
        System.out.println(Arrays.toString(string.split("!!", 3)));
    }
}
