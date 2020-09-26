package offer;

import java.util.ArrayList;

public class num55_finish {
	 public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	 public ListNode EntryNodeOfLoop(ListNode pHead)
	 {
		ArrayList<Integer>list=new ArrayList<Integer>();
		while(pHead!=null) 
		{
			if(!list.contains(pHead.val))
				list.add(pHead.val);
			else {
				return pHead;
			}
			if(pHead.next!=null)
				pHead=pHead.next;
			else
				break;
		}
		return null;
	 }
}
