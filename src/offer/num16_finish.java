package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

//合并两个排序的链表
public class num16_finish {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode Merge(ListNode list1,ListNode list2) {
        List<ListNode>list3=new ArrayList<ListNode>();
        if(list1==null)
        	return list2;
        if(list2==null)
        	return list1;
        if(list1==null&&list2==null)
        	return null;
        while(list1!=null||list2!=null)
        {
        		if(list1.val<list2.val)
        		{
        			list3.add(new ListNode(list1.val));
        			if(list1.next!=null)
        				list1=list1.next;
        			else 
        			{
        				list1=null;
        				break;
        			}
        		}
        		else 
        		{
        			list3.add(new ListNode(list2.val));
        			if(list2.next!=null)
        				list2=list2.next;
        			else 
        			{
        				list2=null;
        				break;
        			}
        		}
        }
        while(list1!=null)
        {
        	list3.add(new ListNode(list1.val));
        	if(list1.next!=null)
        		list1=list1.next;
        	else 
        		break;
        }
        while(list2!=null)
        {
        	list3.add(new ListNode(list2.val));
        	if(list2.next!=null)
        		list2=list2.next;
        	else 
        		break;
        }
        for(int i=0;i<list3.size()-1;i++)
        	list3.get(i).next=list3.get(i+1);
        return list3.get(0);
    }
}
