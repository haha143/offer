package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//���������������У�
//��һ�����б�ʾջ��ѹ��˳��
//���жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
//����ѹ��ջ���������־�����ȡ�
//��������1,2,3,4,5��ĳջ��ѹ��˳��
//����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
//��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ�������
public class num21_finish {
	static Stack<Integer>stack=new Stack<Integer>();
	 public static boolean IsPopOrder(int [] pushA,int [] popA) {
		 ArrayList<Integer>list1=new ArrayList<Integer>();
		 ArrayList<Integer>list2=new ArrayList<Integer>();
		 for(int i=0;i<pushA.length;i++)
			 list1.add(pushA[i]);
		 for(int i=0;i<popA.length;i++)
			 list2.add(popA[i]);
		 Arrays.sort(pushA);
		 Arrays.sort(popA);
		 if(!Arrays.equals(pushA, popA))
			 return false;
		 for(int i=0;i<list2.size();i++)
		 {
			 if(!stack.contains(list2.get(i)))
			 {
				 int j=0;
				 while(list1.get(j)!=list2.get(i))
				 {
					 stack.push(list1.get(j));
					 j++;
				 }
				 stack.push(list1.get(j));
				 for(int k=0;k<j+1;k++)
					 list1.remove(0);
			 }
			 if(stack.pop()!=list2.get(i))
				 return false;
		 }
		 return true;
	    }
	 public static void main(String[] args) {
		 int []pushA={1,2};
		 int []popA={4,5,3,2,1};
		 IsPopOrder(pushA, popA);
	}
}
