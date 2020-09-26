package offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import offer.num56_finish.ListNode;

//��һ���ַ���0<=�ַ�������<=10000��
//ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,
//����������λ��, 
//���û���򷵻� -1
//��Ҫ���ִ�Сд��0��ʼ����
public class num34_finish {
	public  class Node {
	    int val;
	    char ch;
	    int address;
	    Node(char ch,int address) {
	        this.ch =ch;
	        this.address=address;
	        this.val=1;
	    }
	}
	 public int FirstNotRepeatingChar(String str) {
		 int flag=-1;
		 char[]ch=str.toCharArray();
		 Set<Character>set=new HashSet<Character>();
		 List<Node>list=new ArrayList<Node>();
		 for(int i=0;i<ch.length;i++)
		 {
			 if(!set.contains(ch[i]))
			 {
				 set.add(ch[i]);
				 Node node=new Node(ch[i], i);
				 list.add(node);
			 }
			 else
			 {
				 for(int j=0;j<list.size();j++)
				 {
					 if(list.get(j).ch==ch[i])
						 list.get(j).val++;
				 }
			 }
		 }
		 for(int i=0;i<list.size();i++)
		 {
			 if(list.get(i).val==1)
			 {
				 flag=list.get(i).address;
				 break;
			 }
		 } 
		 return flag;
	 }

}
