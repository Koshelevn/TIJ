package control;


import java.util.Arrays;

public class Fibonacci {
   Integer[] fibo(int count){
       Integer num[] = new Integer[count];
       num[0]=1; num[1]=1;
       for(int i=2; i<=num.length-1; i++)
           num[i] = num[i-1] + num[i-2];
       return num;
    }
    public static void main(String[] args) {
       Fibonacci f = new Fibonacci();
       System.out.println(Arrays.toString(f.fibo(10)));
    }
}
