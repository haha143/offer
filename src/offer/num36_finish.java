package offer;

import java.util.ArrayList;
import java.util.List;

//输入两个链表，
//找出它们的第一个公共结点。
public class num36_finish {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int flag=-1;
		if(pHead1==null||pHead2==null)
			return null;
		List<ListNode>list1=new ArrayList<ListNode>();
		List<Integer>list2=new ArrayList<Integer>();
		ListNode node1=pHead1;
		 while(node1!=null) 
		 {
			 list1.add(new ListNode(node1.val));
			 if(node1.next!=null)
				 node1=node1.next;
			 else 
				 break;
		 }
		 while(pHead2!=null) 
		 {
			 list2.add(pHead2.val);
			 if(pHead2.next!=null)
				 pHead2=pHead2.next;
			 else 
				 break;
		 }
		 a:for(int i=0;i<list1.size();i++)
		 {
			 for(int j=0;j<list2.size();j++)
			 {
				 if(list1.get(i).val==list2.get(j))
				 {
					 flag=i;
					 break a;
				 }
			 }
		 }
		 if(flag>-1)
		 {
			 for(int i=flag;i<list1.size()-1;i++)
				 list1.get(i).next=list1.get(i+1);
			 return list1.get(flag);
		 }
		 else 
			 return null;
    }
}
