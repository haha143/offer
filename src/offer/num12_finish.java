package offer;

//给定一个double
//类型的浮点数base
//和int
//类型的整数exponent。
//求base的exponent
//次方。
//保证base和exponent
//不同时为0
public class num12_finish {
	 public double Power(double base, int exponent) {
	        double result=1.0;
	        if(base==0)
	        	result=0;
	        else if(exponent==0)
	        	result=1;
	        else if(exponent>0)
	        {
	        	for(int i=0;i<exponent;i++)
	        		result*=base;
	        }
	        else
	        {
	        	for(int i=0;i<Math.abs(exponent);i++)
	        		result*=base;
	        	result=1/result;
			}
	        return result;
	  }
}
