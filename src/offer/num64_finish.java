package offer;

import java.util.ArrayList;
import java.util.Arrays;

//����һ������ͻ������ڵĴ�С��
//�ҳ����л�����������ֵ�����ֵ
//���������������{2,3,4,2,6,2,5,1}���������ڵĴ�С3��
//��ôһ������6����������,���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}��
//�������{2,3,4,2,6,2,5,1}�Ļ�������������6����
//{[2,3,4],2,6,2,5,1}�� 
//{2,[3,4,2],6,2,5,1}�� 
//{2,3,[4,2,6],2,5,1}�� 
//{2,3,4,[2,6,2],5,1}��
//{2,3,4,2,[6,2,5],1}��
//{2,3,4,2,6,[2,5,1]}��
//���ڴ������鳤�ȵ�ʱ��,���ؿ�
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
