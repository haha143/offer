package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//数组中出现次数超过一半的数字
public class num28_finish {
	public class node
	{
		int num;
		int start;
	}
	public int MoreThanHalfNum_Solution(int [] array) {
        int i=0;
        int len=1+array.length/2;
        int sum=0;
        Arrays.sort(array);
        List<Integer>list1=new ArrayList<Integer>();
        List<node>list2=new ArrayList<node>();
        for(int j=0;j<array.length;j++)
        {
        	if(!list1.contains(array[j]))
        	{
        		list1.add(array[j]);
        		node node=new node();
        		node.num=array[j];
        		node.start=j;
        		list2.add(node);
        	}
        }
        for(int j=0;j<list2.size();j++)
        {
        	if(list2.size()==1)
        	{
        		return list2.get(j).num;
        	}
        	if(j<list2.size()-1)
        	{
        		sum=list2.get(j+1).start-list2.get(j).start;
        		if(sum>=len)
        		{
        			i=list2.get(j).num;
        			break;
        		}
        	}
        	else 
        	{
        		sum=array.length-list2.get(j).start-1;
        		if(sum>=len)
        		{
        			i=list2.get(j).num;
        			break;
        		}
        	}
        }
        return i;
    }
}
