package offer;

public class num30_finish {
	 public int FindGreatestSumOfSubArray(int[] array) {
	     int max=array[0];
	     int []dp=new int [array.length];
	     dp[0]=array[0];
	     for(int i=1;i<array.length;i++)
	     {
	    	 int newmax=dp[i-1]+array[i];
	    	 if(newmax>array[i])
	    		 dp[i]=newmax;
	    	 else
				dp[i]=array[i];
	    	 if(dp[i]>max)
	    		 max=dp[i];
	     }
	     return max;
	    }
}
