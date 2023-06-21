package DataStructureAndAlgorithm;

import java.util.*;
import java.util.Stack;
import java.io.*;

public class StackClass {
	public static void main(String[] args) {

		Stack<Integer> sta=new Stack<>();
		sta.push(15);
		sta.push(30);
		sta.push(45);
		sta.push(60);
		
		System.out.println(sta);
		System.out.println(sta.pop());
		System.out.println(sta.isEmpty());
		System.out.println(sta.peek());
		System.out.println(sta);
		System.out.println(sta.search(30));//counting from the top.
		System.out.println(sta.search(450));//return -1.
	}
}
