//: holding/QueueDemo.java
package holding; /* Added by Eclipse.py */
// Upcasting to a Queue from a LinkedList.
import java.util.*;

public class QueueDemo {
  public static void printQ(Queue queue) {
      //peek()--Retrieves, but does not remove, the head of this queue
    while(queue.peek() != null)
     //remove()--Retrieves and removes the head of this queue
      System.out.print(queue.remove() + " ");
    System.out.println();
  }
  public static void main(String[] args) {
      //Upcasting to a Queue from a LinkedList
    Queue<Integer> queue = new LinkedList<Integer>();
    Random rand = new Random(47);
    for(int i = 0; i < 10; i++)
      //offer()--in queue
      queue.offer(rand.nextInt(i + 10));
    printQ(queue);
    Queue<Character> qc = new LinkedList<Character>();
    for(char c : "Brontosaurus".toCharArray())
      qc.offer(c);
    printQ(qc);
  }
} /* Output:
8 1 1 1 5 14 3 1 0 1
B r o n t o s a u r u s
*///:~
