package DataStructureAndAlgorithm;

import java.util.Stack;
import java.io.*;

public class implementaionOfQueueByStack {

	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();

	// insertion operation
public static void enqueue(int data)
{
	stack1.push(data);
}
//deletion operation

public static int dequeue()
{
	int ele;
	if(stack1.empty()&& stack2.empty())
	{
		System.out.println("queue is Empty");
		System.exit(0);
	}
	while(!stack1.empty())
	{
		ele=stack1.pop();
		stack2.push(ele);
	}
	ele=stack2.pop();
	
	return ele ;
}
public static void print()
{
	System.out.println(stack2);
}
	public static void main(String[] args) {

		implementaionOfQueueByStack q=new implementaionOfQueueByStack();
		q.enqueue(25);
		q.enqueue(50);
		q.enqueue(75);
		
		System.out.println(q.dequeue());
		q.enqueue(100);
		
		System.out.println(q.dequeue());
	q.print();
	}
}
