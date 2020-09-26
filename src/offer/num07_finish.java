package offer;

//ì³²¨ÄÇÆõÊıÁĞ
public class num07_finish {
	public static int Fibonacci(int n) {
		if(n==0)
			return 0;
		else if (n==1) {
			return 1;
		}
		else {
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
    }
}
