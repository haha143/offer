package offer;

import java.util.Arrays;
import java.util.Comparator;

//����һ�����������飬
//����������������ƴ�������ų�һ������
//��ӡ��ƴ�ӳ���������������С��һ����
//������������{3,32,321}��
//���ӡ���������������ųɵ���С����Ϊ321323��
public class num32_finish {
	 public String PrintMinNumber(int [] numbers) {
		 String str="";
		 Integer[]num=new Integer[numbers.length];
		 for(int i=0;i<num.length;i++)
			 num[i]=numbers[i];
		 Arrays.sort(num,comparator);
		 for(int i=0;i<num.length;i++)
			 str+=String.valueOf(num[i]);
		 return str;
	    }
	 Comparator<Integer>comparator=new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int sum1=Integer.parseInt(String.valueOf(o1)+String.valueOf(o2));
	            int sum2=Integer.parseInt(String.valueOf(o2)+String.valueOf(o1));
				return sum1-sum2;
			}
		};
}
