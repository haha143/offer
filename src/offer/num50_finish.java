package offer;

import java.util.ArrayList;
import java.util.List;

public class num50_finish {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
	    boolean flag=false;
	    List<Integer>list=new ArrayList<Integer>();
	    if(numbers==null){}
	    else
	    {
	    	list.add(numbers[0]);
		    for(int i=1;i<length;i++)
		    {
		    	if(!list.contains(numbers[i]))
		    		list.add(numbers[i]);
		    	else 
		    	{
						duplication[0]=numbers[i];
						flag=true;
						break;
				}
		    }
		}
	    return flag;
    }
}
