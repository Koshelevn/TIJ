package strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex17 {
    public static void main(String[] args) {
        String file = args[0];
        String text ="";
        Pattern p = Pattern.compile("//.*");
        Matcher m = p.matcher("");
        int index = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                m.reset(sCurrentLine);
                //text += sCurrentLine;
                while (m.find()) {
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

