package offer;

import java.util.ArrayList;
import java.util.List;

//����һ���������飬
//ʵ��һ�����������������������ֵ�˳��
//ʹ�����е�����λ�������ǰ�벿�֣�
//���е�ż��λ������ĺ�벿�֣�
//����֤������������h
//ż����ż��֮������λ�ò��䡣
public class num13_finish {
    public static void reOrderArray(int [] array) {
    	//ż������
        List<Integer>list1=new ArrayList<Integer>();
        //��������
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
