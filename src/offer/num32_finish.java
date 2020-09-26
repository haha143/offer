package offer;

import java.util.Arrays;
import java.util.Comparator;

//输入一个正整数数组，
//把数组里所有数字拼接起来排成一个数，
//打印能拼接出的所有数字中最小的一个。
//例如输入数组{3,32,321}，
//则打印出这三个数字能排成的最小数字为321323。
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
