package offer;

import java.util.ArrayList;
import java.util.List;
//��һ������������У�
//�����ظ��Ľ�㣬
//��ɾ�����������ظ��Ľ�㣬
//�ظ��Ľ�㲻������
//��������ͷָ�롣 
//����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
		 //��ȡ���еĽڵ��ֵ
		 List<Integer>list1=new ArrayList<Integer>();
		 //��ȡ�ظ��Ľڵ��ֵ
		 List<Integer>list2=new ArrayList<Integer>();
		 //��ȡɾ���ظ��ڵ������
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
