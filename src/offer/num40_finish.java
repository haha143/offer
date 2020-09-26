package offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//一个整型数组里除了两个数字之外，
//其他的数字都出现了两次
//请写程序找出这两个只出现一次的数字。
public class num40_finish {
	public  class Node {
	    int val;
	    int count;
	    Node(int val) {
	        this.val =val;
	        this.count=1;
	    }
	}
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[])
	 {
		 List<Node>list=new ArrayList<Node>();
		 Set<Integer>set=new HashSet<Integer>();
		 List<Integer>list1=new ArrayList<Integer>();
	       for(int i=0;i<array.length;i++) 
	       {
	    	   if(!set.contains(array[i]))
	    	   {
	    		   set.add(array[i]);
	    		   Node node=new Node(array[i]);
	    		   list.add(node);
	    	   }
	    	   else 
	    	   {
	    		   for(int j=0;j<list.size();j++)
	    		   {
	    			   if(list.get(j).val==array[i])
	    				   list.get(j).count++;
	    		   }
	    	   }
	       }
	       for(int i=0;i<list.size();i++)
	       {
	    	   if(list.get(i).count==1)
	    		   list1.add(i);
	       }
	       num1[0]=list.get(list1.get(0)).val;
	       num2[0]=list.get(list1.get(1)).val;
	 }
}
