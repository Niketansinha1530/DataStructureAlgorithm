package DataStructureAndAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class StackByQueue {
static Queue<Integer> queue1=new LinkedList<>();
static Queue<Integer> queue2=new LinkedList<>();

public static void push(int data)
{
	int ele;
	
	while(!queue1.isEmpty())
	{//move all element from queue1 to queue2.
		ele=queue1.poll();//queue2.add(queue1.peek());
		queue2.add(ele);//queue1.poll();
	}
	//add new element in queue one
	queue1.add(data);
	while(!queue2.isEmpty())
	{//move back all element from queue2 to queue1
		queue1.add(queue2.poll());
	}
}
public static int pop()
{
	if(queue1.isEmpty())
	{
		System.out.println("Stack Underflow");
		System.exit(0);
	}
return	queue1.remove();
}
	public static void main(String[] args) {
		
		StackByQueue sq=new StackByQueue();
		sq.push(25);
		sq.push(50);
		sq.push(75);
		sq.push(100);
		System.out.println(sq.pop());
	System.out.println(sq.pop());
	System.out.println(sq.pop());
	System.out.println(sq.pop());
	System.out.println(sq.pop());
	}
}
