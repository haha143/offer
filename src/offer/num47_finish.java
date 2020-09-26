package offer;

public class num47_finish {
	//¶ÌÂ·Ô­Àí
	public int Sum_Solution(int n) {
        int sum=n;
        boolean flag=(sum>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }
}
