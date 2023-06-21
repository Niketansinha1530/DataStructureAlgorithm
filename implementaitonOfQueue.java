package DataStructureAndAlgorithm;
import java.util.LinkedList;
import java.util.Queue;

public class implementaitonOfQueue {

	public static void main(String[] args) {
		
		Queue<Integer> qu=new LinkedList<Integer>();
		//Add element in queue
		for(int i=5;i<50;i=i+3)
		{
			qu.add(i);
		}
		System.out.println(qu);
		//check the top element of queue
		System.out.println("Top most of element of queue: "+qu.peek());
		//remove element from the top(front end)
		qu.remove();
		//again check
		
		System.out.println("Top most element of queue: "+qu.peek());
		//size of queue
		System.out.println("Current size of queue : "+qu.size());
	}
}
