package offer;

import java.util.ArrayList;
import java.util.List;

//��ֻ����������
//2,3��5��������������Ugly Number����
//����6,8���ǳ���,��14����,��Ϊ������������7�� 
//ϰ�������ǰ�1�����ǵ�һ��������
//�󰴴�С�����˳��ĵ�n������
public class num33_unfinfish {
	//�洢�����ڵĳ���
	static List<Integer>list1=new ArrayList<Integer>();
	//�ж��ǲ�������
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
	//�ж��ǲ��ǳ���
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
