package interfaces.interfaceprocessor;


public class StringMixerProcessor extends StringProcessor {
    @Override
    public String process(Object input) {
        String result = "";
        for (int i = 0; i < ((String)input).length()/2; i++) {
            char c1 = ((String) input).charAt(0+i*2);
            char c2 = ((String) input).charAt(1+i*2);
            result += Character.toString(c2) + Character.toString(c1);

        }
        return result;
    }

}
