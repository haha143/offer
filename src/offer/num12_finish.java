package offer;

//����һ��double
//���͵ĸ�����base
//��int
//���͵�����exponent��
//��base��exponent
//�η���
//��֤base��exponent
//��ͬʱΪ0
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
