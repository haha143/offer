package offer;

//����һ�������������32λ�����Ʊ�ʾ��1�ĸ������и����ò����ʾ��
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
			//ȡ��,��÷���
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='1')
					ch[i]='0';
				else 
					ch[i]='1';
			}
			//�ҵ�ĩβ������1
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
