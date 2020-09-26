package offer;

import java.util.ArrayList;
import java.util.List;

//把只包含质因子
//2,3和5的数称作丑数（Ugly Number）。
//例如6,8都是丑数,但14不是,因为它包含质因子7。 
//习惯上我们把1当做是第一个丑数。
//求按从小到大的顺序的第n个丑数
public class num33_unfinfish {
	//存储区间内的丑数
	static List<Integer>list1=new ArrayList<Integer>();
	//判断是不是质数
	public static boolean panduan1(int n)
	{
		if(n==1||n==2||n==3)
			return true;
		if(n%6!=1&&n%6!=5)
			return false;
		for(int i=5;i<=Math.sqrt(n);i+=6)
			if(n %i== 0||n %(i+ 2)==0 )
				return false ;
		return true;
	}
	//判断是不是丑数
	public static boolean Ischou(int n)
	{
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				if(panduan1(i))
				{
					if(i!=1&&i!=2&&i!=3&&i!=5)
						return false;
				}
				if(panduan1(n/i))
				{
					if((n/i)!=1&&(n/i)!=2&&(n/i)!=3&&(n/i)!=5)
						return false;
				}
			}		
		}
		return true;
	}
	public static int GetUglyNumber_Solution(int index) {
		for (int i=1;i<16;i++)
		{
			if(Ischou(i))
				list1.add(i);
		}
        return list1.get(index-1);
    }
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(11));
	}
}
