package offer;

import java.util.ArrayList;
import java.util.Collections;

public class num63_finish {
	static ArrayList<Integer>list=new ArrayList<Integer>();
	public static void Insert(Integer num) 
	{
	    list.add(num);
	    Collections.sort(list);
    }

    public static Double GetMedian() 
    {
    	double num=0.0;
    	if(list.size()%2!=0)
    	{
    		num=list.get(list.size()/2);
    	}
    	else 
    	{
    		num+=list.get(list.size()/2);
    		num+=list.get(list.size()/2-1);
    		num/=2;
    	}
    	return num;
    }
    public static void main(String[] args) {
		Insert(1);
		Insert(3);
		Insert(2);
		System.out.println(list);
	}
    
}
