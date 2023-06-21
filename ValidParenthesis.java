package DataStructureAndAlgorithm;

import java.util.Scanner;
import java.util.Stack;
import java.io.*;
//Timecomplexity is O(n)
//Spacecomplexity is O(n)
public class ValidParenthesis {
public static boolean isValid(String str)
{
	char[] chars=str.toCharArray();
	Stack<Character> st=new Stack();
	for(char ele: chars)
	{
		//if the element contain open bracket then push it to the stack.
		if(ele=='('||ele=='['||ele=='{')
		{
			st.push(ele);
			continue;
		}
		
		else if (st.empty()) {
			return false;
		}
		char top=st.pop();
	    if(top=='(' && ele!=')')
		{
			return false;
		}
		else if(top=='[' && ele!=']')
		{
			return false;
		}
		else if(top=='{' && ele!='}')
		{
			return false;
		}
	}
	return(st.empty()==true);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		System.out.println("Is the String is valid: "+isValid(str));
	}
}
