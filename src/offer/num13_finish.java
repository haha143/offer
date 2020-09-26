package offer;

import java.util.ArrayList;
import java.util.List;

//输入一个整数数组，
//实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，
//所有的偶数位于数组的后半部分，
//并保证奇数和奇数，h
//偶数和偶数之间的相对位置不变。
public class num13_finish {
    public static void reOrderArray(int [] array) {
    	//偶数数列
        List<Integer>list1=new ArrayList<Integer>();
        //奇数数列
        List<Integer>list2=new ArrayList<Integer>();
        for(int i=0;i<array.length;i++)
        {
        	if(array[i]%2==0)
        		list1.add(array[i]);
        	else 
        		list2.add(array[i]);
        }
        for(int i=0;i<array.length;i++)
        {
        	if(i<list2.size())
        	{
        		array[i]=list2.get(i);
//        		 System.out.println(array[i]);
        	}
        	else 
        	{
        		array[i]=list1.get(i-list2.size());
//        		System.out.println(array[i]);
        	}
        }
//        System.out.println(list1);
//        System.out.println(list2);
//        for(int i=0;i<array.length;i++)
//        	System.out.println(array[i]);
    }
    public static void main(String[] args) {
		int []num= {1,2,3,4,5,6,7};
		reOrderArray(num);
	}
}
