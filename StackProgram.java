package ashwin;

import java.util.*;

public class StackProgram {
	
	
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		boolean result = stk.empty(); 
		System.out.println("Is the stack empty? " + result);  
		stk.push(11);
		stk.push(8);
		stk.push(9);
		stk.push(23);
		stk.push(14);
		stk.push(4);
		stk.push(3);
		System.out.println(stk);
		result = stk.empty(); 
		System.out.println("Is the stack empty? " + result);
		System.out.println(stk.peek());
		System.out.println(stk.search(3));
		stk.pop();
		stk.pop();
		stk.pop();
		System.out.println(stk);
		
	}
}
