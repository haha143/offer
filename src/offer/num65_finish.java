package offer;

public class num65_finish {
	 public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
	    {
	        for(int i = 0; i < rows; i++){
	            for(int j = 0; j < cols; j++){
	                boolean[] flag = new boolean[matrix.length];
	                if(hasPath(matrix, rows, cols, str, i, j, flag, 0)) return true;
	            }
	        }
	        return false;
	    }

	    public boolean hasPath(char[] matrix, int rows, int cols, char[] str, int i, int j, boolean[] flag, int k){
	        int index = i * cols + j;
	        if(i < 0 || j < 0 || i >= rows || j >= cols || flag[index] == true || matrix[index] != str[k]) return false;
	        if(k == str.length - 1) return true;
	        flag[index] = true;
	        if(hasPath(matrix, rows, cols, str, i - 1, j, flag, k + 1)
	        ||hasPath(matrix, rows, cols, str, i + 1, j, flag, k + 1)
	        ||hasPath(matrix, rows, cols, str, i, j - 1, flag, k + 1)
	        ||hasPath(matrix, rows, cols, str, i, j + 1, flag, k + 1)) return true;
	        
	        return false;
	    }
}
