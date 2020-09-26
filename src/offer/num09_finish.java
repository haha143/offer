package offer;
//±äÌ¬ÌøÌ¨½×
public class num09_finish {
public int JumpFloorII(int target) {
        if(target==1)
        	return 1;
        else 
        {
        	int sum=0;
        	for(int i=1;i<target;i++)
        	{
        		sum+=JumpFloorII(i);
        	}
        	return sum+1;
        }
    }
}
