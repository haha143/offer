package offer;

//����һ������
//����������е�����k
//����㡣
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
		 //�������Ϊ�գ�ֱ�ӷ��ؼ���
		 if(head==null)
		 {
			return head; 
		 }
		 else 
		 {
			 ListNode node1=new ListNode(head.val);
			 node1.next=head.next;
			 //���ҳ�����ĳ���
			 while(node1.next!=null)
			 {
				 node1=node1.next;
				 count++;
			 }
			 //������ҵĽڵ��Ѿ���������ķ�ΧҲ��Ӧ�ķ���Ϊ��
             if(k>count)
             {
                 return null;
             }
             else 
             {
            	 //ע��һ�²��ҵĴ�����head
            	 //�����Ѿ�����һ����
                 flag=count-k;
                 for(int i=0;i<flag;i++)
                     head=head.next;
		         return head; 
             } 
		 }
	 }
}
