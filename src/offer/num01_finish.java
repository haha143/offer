package offer;

import java.util.HashSet;
import java.util.Scanner;

//二维数组中的查找
public class num01_finish {
    public static boolean Find(int target, int [][] array) {
    	boolean flag=false;
    	HashSet<Integer>set1=new HashSet<Integer>();
    	for(int i=0;i<array.length;i++)
    	{
    		for(int j=0;j<array[0].length;j++)
    		{
    			set1.add(array[i][j]);
    		}
    	}
    	if(set1.contains(target))
    		flag=true;
		return flag;
   }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int k=scanner.nextInt();
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int [][]num=new int [n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				num[i][j]=scanner.nextInt();
			}
		}
		System.out.println(Find(k,num));
	}
}
