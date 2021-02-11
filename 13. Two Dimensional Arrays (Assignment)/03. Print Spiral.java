public class Solution {
    public static void spiralPrint(int mat[][]){
        int nRows = mat.length;
        if (nRows == 0) {
            return; 
        } 
        int mCols = mat[0].length; 
        int i, rowStart = 0, colStart = 0;
        int numElements = nRows * mCols, count = 0;
        while(count < numElements){
            for(i = colStart; count < numElements && i < mCols; ++i) {
                System.out.print(mat[rowStart][i]+ " "); 
                count++;
            } 
            rowStart++;
            for(i = rowStart; count < numElements && i < nRows; ++i) {
                System.out.print(mat[i][mCols - 1] + " ");
                count++; 
            } 
            mCols--; 
            for(i = mCols - 1; count < numElements && i >= colStart; --i) {
                System.out.print(mat[nRows - 1][i] + " "); count++; 
            } 
            nRows--; 
            for(i = nRows - 1; count < numElements && i >= rowStart; --i) {
                System.out.print(mat[i][colStart] + " "); 
                count++;
            } 
            colStart++; 
        } 
    } 
}