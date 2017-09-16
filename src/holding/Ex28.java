package holding;


import java.util.PriorityQueue;
import java.util.Random;

public class Ex28 {
    public static void main(String[] args) {
        Random random = new Random();
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        for (int i=0; i<10; i++)
            queue.offer(random.nextDouble());
        while (queue.peek()!=null)
            System.out.println(queue.poll());
    }
}
