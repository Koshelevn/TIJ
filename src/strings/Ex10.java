package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
    public static void main(String[] args) {
        String string = "Java now has regular expressions";
        String regs[] = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "S{1}.", "s{0,3}"};
            for(String reg:regs){
                System.out.println("Regular expression: " + reg);
                Pattern p = Pattern.compile(reg);
                Matcher m = p.matcher(string);
                while (m.find())
                    System.out.println("Match \"" + m.group() + "\" at position " + m.start() + "-" + (m.end()-1));
        }
    }
}
