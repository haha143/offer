package offer;

//统计一个数字在排序数组中出现的次数
public class num37_finish {
	public int GetNumberOfK(int [] array , int k) {
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==k)
				count++;
			if(array[i]!=k&&count>0)
				break;
		}
		return count;
    }
}
