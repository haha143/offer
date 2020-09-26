package offer;

import java.util.ArrayList;
import java.util.List;

//��һ���ַ���ת����һ��������
//Ҫ����ʹ���ַ���ת�������Ŀ⺯����
//��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
public class num49_finish {
	
	public static boolean panduan(String str)
	{
		if(str.equals(""))
			return false;
		char[]ch=str.toCharArray();
		if(!((ch[0]>='0'&&ch[0]<='9')||ch[0]=='+'||ch[0]=='-'))
			return false;
		for(int i=1;i<ch.length;i++)
		{
			if(!(ch[i]>='0'&&ch[i]<='9'))
				return false;
		}
		return true;	
	}
	
	public  static int  StrToInt(String str) 
	{
        if(panduan(str))
        {
        	int sum=0;
        	int count=1;
        	if(str.charAt(0)=='+')
        	{
        		String str1=str.substring(1,str.length());
        		char[]ch=str1.toCharArray();
        		List<Integer>list=new ArrayList<Integer>();
        		for(int i=ch.length-1;i>-1;i--)
        			list.add(Character.getNumericValue(ch[i]));
        		for(int i=0;i<list.size();i++)
        		{
        			sum+=list.get(i)*count;
        			count*=10;
        		}
        		return sum;
        		
        	}
        	else if(str.charAt(0)=='-')
        	{
        		String str1=str.substring(1,str.length());
        		char[]ch=str1.toCharArray();
        		List<Integer>list=new ArrayList<Integer>();
        		for(int i=ch.length-1;i>-1;i--)
        			list.add(Character.getNumericValue(ch[i]));
        		for(int i=0;i<list.size();i++)
        		{
        			sum+=list.get(i)*count;
        			count*=10;
        		}
        		return 0-sum;
        	}
        	else 
        	{
        		char[]ch=str.toCharArray();
        		List<Integer>list=new ArrayList<Integer>();
        		for(int i=ch.length-1;i>-1;i--)
        			list.add(Character.getNumericValue(ch[i]));
        		for(int i=0;i<list.size();i++)
        		{
        			sum+=list.get(i)*count;
        			count*=10;
        		}
        		return sum;
        	}
        }
        else 
        	return 0;  	
    }
	public static void main(String[] args) {
		System.out.println(StrToInt("0012"));
	}
}
