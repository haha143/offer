package offer;

//��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ
//����������С��
//�����ַ���"+100","5e2","-123","3.1416"
//��"-1E-16"
//����ʾ��ֵ��
//����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"
//������
public class num53_best {
	 public boolean isNumeric(char[] str) {
	        int len = str.length;
	        boolean sign = false, decimal = false, hasE = false;
	        for(int i = 0; i < len; i++){
	            if(str[i] == '+' || str[i] == '-'){
	                if(!sign && i > 0 && str[i-1] != 'e' && str[i-1] != 'E')
	                    return false;
	                if(sign && str[i-1] != 'e' && str[i-1] != 'E')
	                    return false;
	                sign = true;
	            }else if(str[i] == 'e' || str[i] == 'E'){
	                if(i == len - 1)
	                    return false;
	                if(hasE)
	                    return false;
	                hasE = true;
	            }else if(str[i] == '.'){
	                if(hasE || decimal)
	                    return false;
	                decimal = true;
	            }else if(str[i] < '0' || str[i] > '9')
	                return false;
	        }
	        return true;
	    }
}
