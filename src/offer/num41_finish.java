package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class num41_finish {
	public int figure(int sum)
	{
		for(int i=1;i<=sum;i++)
		{
			if((i+1)*i==2*sum)
				return i;
			if((i+1)*i>2*sum)
				return i-1;
		}
		return 0;
	}
	public int jisuan(int d,int n)
	{
		return d*(d+1)/2+(n-1)*d;
	}
	Comparator<ArrayList<Integer>>comparator=new Comparator<ArrayList<Integer>>() {

		@Override
		public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
			return o1.get(0)-o2.get(0);
		}
	};
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
		int n=figure(sum);
		for(int i=2;i<=n;i++)
		{
			ArrayList<Integer>list2=new ArrayList<Integer>();
			list2.clear();
			if(i%2==0)
			{
				int cha=sum-jisuan(i, 1);
				if(cha%i==0)
				{
					for(int j=1;j<i+1;j++)
						list2.add(j+(cha/i)*i/2);
					list.add(list2);
				}
			}
			else 
			{
				if(sum%i==0)
				{
					int count=sum/i-i/2;
					for(int j=0;j<i;j++)
						list2.add(count+j);
					list.add(list2);	
				}
			}
		}
		Collections.sort(list, comparator);
		return list;
    }
}
