package Oct11;

import static java.lang.System.out;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] groupA = {"우즈베키스탄","쿠웨이트","사우디","대한민국"};
		
		Stack<String> stack = new Stack<String>();
		for(String n : groupA)
			stack.push(n);
		
		while(!stack.isEmpty())
			out.println(stack.pop());
	}

}
