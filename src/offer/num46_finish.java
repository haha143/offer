package offer;

import java.util.ArrayList;

public class num46_finish 
{
	public int LastRemaining_Solution(int n, int m) 
	 {
		 if(n==0)
			 return -1;
		 ArrayList<Integer>list=new ArrayList<Integer>();
		 for(int i=0;i<n;i++)
			 list.add(i); 
		 int count=0;
		 while(list.size()>1)
		 {
			 for(int i=0;i<m;i++)
			 {
				 count++;
				 if(count>list.size())
				 {
					 count%=list.size();
				 }
			 }
			 list.remove(--count);
		 }
		 return list.get(0);
	 }
}
