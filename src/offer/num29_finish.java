package offer;

import java.util.ArrayList;
import java.util.Arrays;

//����n��������
//�ҳ�������С��K������
//��������4,5,1,6,2,7,3,8
//��8�����֣�
//����С��4��������1,2,3,4��
public class num29_finish {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer>list=new ArrayList<Integer>();
        if(k>input.length)
        	return list;
        else 
        {
        	for(int i=0;i<k;i++)
            	list.add(input[i]);
            return list;
        }  
    }
}
