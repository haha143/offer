package offer;

import java.util.ArrayList;

//输入一个矩阵，
//按照从外向里以顺时针的顺序依次打印出每一个数字
//例如如果输入如下4 X 4
//矩阵  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
public class num19_finish {
	 public ArrayList<Integer> printMatrix(int [][] matrix) {
         ArrayList<Integer>list=new ArrayList<Integer>();
         if(matrix==null||matrix.length==0||matrix[0].length==0)
                   return list;
         int up=0;
         int down=matrix.length;
         int left=0;
         int right=matrix[0].length;
         while(true)
         {
             for(int i=left;i<right;i++)
                 list.add(matrix[up][i]);
             up++;
             if(up>=down)
                 break;
              
             for(int i=up;i<down;i++)
                 list.add(matrix[i][right-1]);
             right--;
             if(right<=left)
                 break;
              
             for(int i=right-1;i>left-1;i--)
                 list.add(matrix[down-1][i]);
             down--;
             if(down<=up)
                 break;
              
             for(int i=down-1;i>up-1;i--)
                 list.add(matrix[i][left]);
             left++;
             if(left>=right)
                 break;
              
         }
         return list;
        }
}
