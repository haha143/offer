package offer;

import java.util.ArrayList;
import java.util.List;
//在一个排序的链表中，
//存在重复的结点，
//请删除该链表中重复的结点，
//重复的结点不保留，
//返回链表头指针。 
//链表1->2->3->3->4->4->5 处理后为 1->2->5
public class num56_finish {
	 public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode deleteDuplication(ListNode pHead)
	{
		 //存取所有的节点的值
		 List<Integer>list1=new ArrayList<Integer>();
		 //存取重复的节点的值
		 List<Integer>list2=new ArrayList<Integer>();
		 //存取删除重复节点的链表
		 List<ListNode>list3=new ArrayList<ListNode>();
		 while(pHead!=null) 
		 {
			 int node=pHead.val;
			 if(!list1.contains(node))
				 list1.add(node);
			 else 
				 list2.add(node);
			 if(pHead.next!=null)
				 pHead=pHead.next;
			 else 
				 break;
		 }
		 for(int i=0;i<list1.size();i++)
		 {
			 if(!list2.contains(list1.get(i)))
			 {
				 ListNode node=new ListNode(list1.get(i));
				 list3.add(node);
			 }
		 }
		 if(list3.size()==0)
			 return null;
		 else 
		 {
			 for(int i=0;i<list3.size()-1;i++)
				 list3.get(i).next=list3.get(i+1);
			 return list3.get(0);
		}
	}
}
