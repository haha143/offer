package offer;

public class num33_best {
	public int GetUglyNumber_Solution(int index) {
        if(index <= 0)return 0;
        int p2=0,p3=0,p5=0;//��ʼ������ָ������Ǳ�ڳ�Ϊ��С������λ��
        int[] result = new int[index];
        result[0] = 1;//
        for(int i=1; i < index; i++){
            result[i] = Math.min(result[p2]*2, Math.min(result[p3]*3, result[p5]*5));
            if(result[i] == result[p2]*2)p2++;//Ϊ�˷�ֹ�ظ���Ҫ����if���ܹ��ߵ�
            if(result[i] == result[p3]*3)p3++;//Ϊ�˷�ֹ�ظ���Ҫ����if���ܹ��ߵ�
            if(result[i] == result[p5]*5)p5++;//Ϊ�˷�ֹ�ظ���Ҫ����if���ܹ��ߵ�
        }
        return result[index-1];
    }
}
