package offer;

import java.util.ArrayList;

public class num42_finish {
	 public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	        ArrayList<Integer>list1=new ArrayList<Integer>();
	        ArrayList<Integer>list2=new ArrayList<Integer>();
	        int flag=Integer.MAX_VALUE;
	        int num=1;
	        for(int i=0;i<array.length;i++)
	        	list2.add(array[i]);
	        for(int i=0;i<array.length;i++)
	        {
	        	if(list2.contains(sum-array[i]))
	        	{
	        		num=(sum-array[i])*array[i];
	        		if(num<flag)
	        		{
	        			list1.clear();
	        			flag=num;
	        			list1.add(Math.min(sum-array[i], array[i]));
	        			list1.add(Math.max(sum-array[i], array[i]));
	        		}
	        	}
	        }
	        return list1;
	    }
}
