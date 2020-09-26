package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class num23_finish {
	public boolean panduan(int []num1,int []num2)
	{
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<num2.length;i++)
			list.add(num2[i]);
		for(int i=0;i<num1.length;i++)
		{
			if(!list.contains(num1[i]))
				return false;
		}
		return true;
	}
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length==0)
			return false;
		int []num=new int [sequence.length];
		for(int i=0;i<num.length;i++)
			num[i]=sequence[i];
		Arrays.sort(sequence);
		for(int i=0;i<sequence.length;i++)
		{
			if(sequence[i]==num[num.length-1])
			{
				int []left=Arrays.copyOfRange(sequence, 0, i);
				int []right=Arrays.copyOfRange(sequence, i+1, num.length);
				if(!panduan(left, Arrays.copyOfRange(num, 0, i)))
					return false;
				if(!panduan(right, Arrays.copyOfRange(num, i, num.length-1)))
					return false;
				VerifySquenceOfBST(Arrays.copyOfRange(num, 0, i));
				VerifySquenceOfBST(Arrays.copyOfRange(num, i, num.length-1));
			}
		}
        return true;
    }
}
     