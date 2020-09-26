package offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class num54_finish {
	public  class Node {
	    int val;
	    char ch;
	    Node(char ch) {
	        this.ch =ch;
	        this.val=1;
	    }
	}
	 String str="";
	 public void Insert(char ch)
	    {
	        str=str+ch;
	    }
	 public char FirstAppearingOnce()
	    {
		 char flag='#';
		 char[]ch=str.toCharArray();
		 Set<Character>set=new HashSet<Character>();
		 List<Node>list=new ArrayList<Node>();
		 for(int i=0;i<ch.length;i++)
		 {
			 if(!set.contains(ch[i]))
			 {
				 set.add(ch[i]);
				 Node node=new Node(ch[i]);
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
				 flag=list.get(i).ch;
				 break;
			 }
		 } 
		 return flag;
	    }
}
