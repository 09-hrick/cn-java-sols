public class Solution {

	public static void totalSum(int[][] mat) {
		int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==0||i==mat.length-1){
                sum+=mat[i][j];
                }
                else {
                    if(i==j||i+j==mat.length-1)
                        sum+=mat[i][j];
                     }
            }
        }     
        for(int i=1;i<mat.length-1;i++){
            for(int j=0;j<mat[i].length;j++){
                if(j==0||j==mat[i].length-1){
                    sum+=mat[i][j];
                }
            }
        }
	System.out.println(sum);
    }

}