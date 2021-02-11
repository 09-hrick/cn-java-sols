public class Solution {
    public static void rowWiseSum(int[][] mat){  
        int nRows = mat.length;
        if (nRows == 0) { 
            return; 
        } 
        int mCols = mat[0].length;
        for(int i = 0; i < nRows; i++){
            int rowSum = 0; 
            for(int j = 0;
                j < mCols; j++) {
                rowSum += mat[i][j];
            } System.out.print(rowSum + " "); 
        } 
    }                                
}
