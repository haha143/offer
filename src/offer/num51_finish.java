package offer;

public class num51_finish {
	public int[] multiply(int[] A) {
		int []B=new int [A.length];
		for(int i=0;i<B.length;i++)
		{
			int sum1=1;
			int sum2=1;
			for(int j=0;j<i;j++)
				sum1*=A[j];
			for(int j=i+1;j<B.length;j++)
				sum2*=A[j];
			B[i]=sum1*sum2;
		}
		return B;
    }
}
