package offer;

//�����������һ����λָ�����ѭ�����ƣ�ROL����
//�����и��򵥵�����
//�������ַ���ģ�����ָ�����������
//����һ���������ַ�����S��
//�������ѭ������Kλ����������
//�ַ�����S=��abcXYZdef��,
//Ҫ�����ѭ������3λ��Ľ����
//����XYZdefabc����
//�ǲ��Ǻܼ򵥣�OK���㶨����
public class num43_finish {
	 public static String LeftRotateString(String str,int n) {
		 String str1="";
		 if(str==null)
			 return null;
		 if(n>str.length())
			 return null;
	     String str2=str.substring(0, n);
	     String str3=str.substring(n, str.length());
//	     System.out.println(str2+"   "+str3);
	     str1+=str3;
	     str1+=str2;
	     return str1;
	 }
	 public static void main(String[] args) {
		System.out.println(LeftRotateString("", 5));
	}
}
