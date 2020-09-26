package offer;

//输入一个整数输出该数32位二进制表示中1的个数其中负数用补码表示。
public class num11_finish {
	public static int NumberOf1(int n) {
		int count=0;
		if(n==0)
			count=0;
		else if(n>0)
		{
			String string=Integer.toBinaryString(n);
			char[]ch=string.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='1')
					count++;
			}
		}
		else 
		{
			String string=Integer.toBinaryString(Math.abs(n));
			string=String.format("%32s",string);
			int flag=0;
			char[]ch=string.toCharArray();
			//取反,获得反码
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='1')
					ch[i]='0';
				else 
					ch[i]='1';
			}
			//找到末尾连续的1
			for(int i=ch.length-1;i>-1;i--)
			{
				if(ch[i]=='0')
				{
					ch[i]='1';
					flag=i;
					break;
				}
				else 
					ch[i]='0';
			}
			for(int i=flag;i>-1;i--)
			{
				if(ch[i]=='1')
					count++;
			}
		}
		return count;
    }
	public static void main(String[] args) {
		System.out.println(NumberOf1(-2147483648));
	}
}
