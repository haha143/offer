package offer;

import java.util.ArrayList;
import java.util.Arrays;

//给定一个数组和滑动窗口的大小，
//找出所有滑动窗口里数值的最大值
//例如如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
//那么一共存在6个滑动窗口,他们的最大值分别为{4,4,6,6,6,5}；
//针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
//{[2,3,4],2,6,2,5,1}， 
//{2,[3,4,2],6,2,5,1}， 
//{2,3,[4,2,6],2,5,1}， 
//{2,3,4,[2,6,2],5,1}，
//{2,3,4,2,[6,2,5],1}，
//{2,3,4,2,6,[2,5,1]}。
//窗口大于数组长度的时候,返回空
public class num64_finish {
	public int max(int []num) 
	{
		Arrays.sort(num);
		return num[num.length-1];
	}
	 public ArrayList<Integer> maxInWindows(int [] num, int size)
	 {
		 ArrayList<Integer>list=new ArrayList<Integer>();
	      if(size>num.length)
	    	  return list;
        if(size==0)
	    	  return list;
	      for(int i=0;i<num.length-size+1;i++)
	    	  list.add(max(Arrays.copyOfRange(num, i, i+size)));
	      return list;
	 }
}
