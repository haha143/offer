package offer;

import java.util.ArrayList;
import java.util.Stack;
//从尾到头打印链表
public class num03_finish {
	public class ListNode
	{
		int val;
		ListNode next = null;
		ListNode(int val)
		{
			this.val = val;
		} 
	}
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        Stack<Integer>stack=new Stack<Integer>();
        while(listNode!=null)
        {	
            	stack.push(listNode.val);
            	listNode=listNode.next;
        }  
        while (!stack.empty()) {
			list.add(stack.pop());
		}
        return list;
    }
}
