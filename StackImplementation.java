package DataStructureAndAlgorithm;

class Stack
{
	int top;
	int size;
	public int arr[];
	
	public Stack(int size)
	{
		top=-1;
		this.size=size;
		arr=new int[size];
		
	}
	public void Push(int item)
	{
		if(top==size-1)
		{
			System.out.println("Stack overflow");
			return;
		}
		else {
			top++;
			arr[top]=item;
			return;
		}
	}
	public void Pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return;
		}
		else {
			top--;
		}
	}
	public void peek()
	{
		if(top==-1)
		{
			System.out.println("No element present");
		}
		else {
			System.out.println(arr[top]);
		}
	}
	public boolean isEmpty()
	{
		if(top!=size-1)
		{
			return true;
		}
		else {
			return false;
			}
	}
	public boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public void printStack()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public int size()
	{
		return size;
	}
}
public class StackImplementation {

	public static void main(String[] args) {
		
		Stack s=new Stack(5);
		System.out.println(s.size());
		System.out.println(s.isFull());
		System.out.println(s.isEmpty());
		s.Push(1);
		s.Push(2);
		s.Pop();
		s.printStack();
		
	}
}
