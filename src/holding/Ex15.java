package holding;

import net.mindview.util.Stack.*;
public class Ex15 {
    public static void main(String[] args) {
        String ex = "+U+n+c—+e+r+t—+a—+i—+n+t+y—+ -+r+u—+l+e+s—";
        Stack<Character> stack= new Stack<Character>();
        char[] chars = ex.toCharArray();
        for(int i =0; i<chars.length; i++){
            if(chars[i]=='+')
                stack.push(chars[i+1]);
            else if(chars[i]=='—'){
                System.out.print(stack.pop());
            }
        }
    }
}
