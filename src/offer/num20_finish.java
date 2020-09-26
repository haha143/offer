package offer;
import java.util.Stack;
//定义栈的数据结构，
//请在该类型中实现一个能够得到栈中所含最小元素的min
//函数
public class num20_finish {
	Stack<Integer>stack1=new Stack<Integer>();
	Stack<Integer>stack2=new Stack<Integer>();
	public void push(int node) {
		if(stack1.isEmpty())
		{
			stack1.push(node);
			stack2.push(node);
		}
		else {
			if(node<stack2.peek()) 
				stack2.push(node);
			else 
				stack2.push(stack2.peek());
			stack1.push(node);
		}
	}
   
    public void pop() {
    	stack1.pop();
    	stack2.pop();
    }
    
    public int top() {
    	return stack2.peek();
    }
    
    public int min() {
    	return top();
    }
}
