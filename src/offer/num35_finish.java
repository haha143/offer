package offer;


//数组中的逆序对
public class num35_finish {
	 static int value=0;
	  public  int InversePairs(int [] array) {		
			mergesort(array,0,array.length-1);
			return value;
		}	
		private  void mergesort(int[] array, int l, int r) {
			int mid=(l+r)/2;
			if(l<r)
			{
				mergesort(array, l, mid);
				mergesort(array, mid+1, r);
				merge(array, l,mid, r);
			}
		}
		private  void merge(int[] array, int l, int mid, int r) {
			int left=l;int right=mid+1;
			int num[]=new int[r-l+1];
			int index=0;
			while (left<=mid&&right<=r) {
				if(array[left]<=array[right])
				{
					num[index++]=array[left++];
				}
				else {				
					num[index++]=array[right++];
					value+=mid-left+1;
	                value%=1000000007;
				}
			}
			while(left<=mid)
		      {
				num[index++]=array[left++];
		      }
			while(right<=r)
		      {
				num[index++]=array[right++];
		      }	
			for(int i=0;i<index;i++)
			{
				array[l+i]=num[i];
			}	
		}
}
