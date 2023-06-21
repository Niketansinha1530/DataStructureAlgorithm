package DataStructureAndAlgorithm;
import java.util.*;
public class DequeImple {

	public static void main(String[] args) {
		
		Deque<Integer> deque=new ArrayDeque<>();
		deque.addLast(5);
		deque.addLast(7);
		deque.addLast(9);
		System.out.println(deque);
		
		deque.removeFirst();
		System.out.println(deque);
		
	}
}
