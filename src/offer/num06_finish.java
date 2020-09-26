package offer;

import java.util.Arrays;

//��ת�������С����(��δ�ö��ַ�ʵ����Ľ�)
public class num06_finish {
	//�ص���ʹ�ö��ֲ�
//	public int minNumberInRotateArray(int [] array) {
//	    if(array.length==0)
//	    	return 0;
//	    else 
//	    {
//	    	Arrays.sort(array);
//	    	return array[0];
//	    }
//    }
	public static int minNumberInRotateArray(int [] array) {
		if(array.length==0) return 0;
		if(array.length==1) return array[0];
		int first=0;
		int last=array.length-1;
		int mid=(last-first)/2;
		if(array[mid]<array[last])
		{
			return minNumberInRotateArray(Arrays.copyOfRange(array, first,mid+1));
		}
		else if(array[mid]>array[last])
		{
			return minNumberInRotateArray(Arrays.copyOfRange(array, mid+1,last+1));
		}
		else 
		{
			return minNumberInRotateArray(Arrays.copyOfRange(array, first,last));
		}
    }
//	public static void main(String[] args) {
//		int []array= {3,4,5,1,2};
//		System.out.println(minNumberInRotateArray(array));
//	}
}
