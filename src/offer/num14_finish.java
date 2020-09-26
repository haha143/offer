package offer;

//输入一个链表，
//输出该链表中倒数第k
//个结点。
public class num14_finish {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	 public ListNode FindKthToTail(ListNode head,int k)
	 {
		 int count=1;
		 int flag=0;
		 //如果链表为空，直接返回即可
		 if(head==null)
		 {
			return head; 
		 }
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
			 //如果查找的节点已经超出链表的范围也相应的返回为空
             if(k>count)
             {
                 return null;
             }
             else 
             {
            	 //注意一下查找的次数，head
            	 //本身已经包含一次了
                 flag=count-k;
                 for(int i=0;i<flag;i++)
                     head=head.next;
		         return head; 
             } 
		 }
	 }
}
