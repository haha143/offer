package offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import offer.num56_finish.ListNode;

//在一个字符串0<=字符串长度<=10000，
//全部由字母组成)中找到第一个只出现一次的字符,
//并返回它的位置, 
//如果没有则返回 -1
//需要区分大小写从0开始计数
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
