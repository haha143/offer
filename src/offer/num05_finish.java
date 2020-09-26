package offer;

import java.io.PushbackInputStream;
import java.util.Stack;

//用两个栈来实现一个队列,完成队列的push与pop
public class num05_finish {
	 static Stack<Integer> stack1 = new Stack<Integer>();
	 static Stack<Integer> stack2 = new Stack<Integer>(); 
	 public static void push(int node) {
	     stack1.push(node); 
	 }
	 public static int pop() {
		stack2.clear();
		int node;
	    if(stack1==null)
	    	return (Integer) null;
	    else 
	    {
	    	while(!stack1.empty())
	    	{
	    		stack2.push(stack1.pop());
	    	}
	    	node=stack2.pop();
	    	while (!stack2.empty()) {
	    		stack1.push(stack2.pop());
			}	
	    	return node;
	    }
	 }
//	 public static void main(String[] args) {
//		 push(1);
//		 System.out.println(stack1);
//		 push(2);
//		 System.out.println(stack1);
//		 push(3);
//		 System.out.println(stack1);
//		 pop();
//		 System.out.println(stack1);
//		 pop();
//		 System.out.println(stack1);
//		 push(4);
//		 System.out.println(stack1);
//		 pop();
//		 System.out.println(stack1);
//		 push(5);
//		 System.out.println(stack1);
//		 pop();
//		 System.out.println(stack1);
//		 pop();
//		 System.out.println(stack1);		 
//	}
}
