package offer;

import java.util.ArrayList;
import java.util.List;

import offer.num15_finish.ListNode;

//输入一个链表，
//反转链表后，
//输出新链表的表头。
public class num15_finish {
	public class ListNode {
	    int val;
	    ListNode next = null;
	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode FindKthToTail(ListNode head,int k,int count)
	{
		 if(head==null)
		 {
			return head; 
		 }
		 else 
		 {
			 //如果查找的节点已经超出链表的范围也相应的返回为空
             if(k>count)
             {
                 return null;
             }
             else 
             {
            	ListNode node1=new ListNode(head.val);
         		node1.next=head.next;
         		int flag=count-k;
                 for(int i=0;i<flag;i++)
                     node1=node1.next;
                 return node1; 
             } 
		 }
		
	}
	public ListNode ReverseList(ListNode head) {
		int count=1;
		if(head==null)
			return null;
		else 
		{
			ListNode node1=new ListNode(head.val);
		    node1.next=head.next;
		    //查找出链表的长度
		    while(node1.next!=null)
		    {
		    	node1=node1.next;
		    	count++;
			}
			List<ListNode>list=new ArrayList<ListNode>();
			for(int i=1;i<=count;i++)
			{
				ListNode node=new ListNode(FindKthToTail(head, i, count).val);
				list.add(node);
			}
			for(int i=0;i<list.size()-1;i++)
				list.get(i).next=list.get(i+1);
			return list.get(0);
		}	
    }
}
