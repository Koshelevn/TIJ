package strings;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.script.ScriptEngine.FILENAME;

public class Ex16 {

    public static void main(String[] args) {
        String file = args[0];
        Pattern p = Pattern.compile(args[1]);
        Matcher m = p.matcher("");
        int index=1;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                m.reset(sCurrentLine);
                while (m.find()){
                    System.out.println(index++ + ": " +
                            m.group());
                }
            }
        } catch (FileNotFoundException nf) {
            System.out.println("File not found");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
