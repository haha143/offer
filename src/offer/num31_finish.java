package offer;

//���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ���
//Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13
//��˹�����6��,���Ƕ��ں�����������û���ˡ�ACMer
//ϣ�����ǰ����,
//������������ձ黯
//,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�����
public class num31_finish {
	 public static int NumberOf1Between1AndN_Solution(int n)
	 {
		 int count=0;
		 for(int i=1;i<n+1;i++)
		 {
			 String str=String.valueOf(i);
			 char[]ch=str.toCharArray();
			 for(int j=0;j<ch.length;j++)
			 {
				 if(ch[j]=='1')
					 count++;
			 }
		 }
		 return count;
	 }
	 public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(100));
	}
}
