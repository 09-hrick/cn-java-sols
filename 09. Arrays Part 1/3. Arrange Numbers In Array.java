import java.util.Scanner;
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	                 /* MADE BY RUDRAKSH*/
        
        int i;
		int k=0;
		
		for(i=1;i<=n;i+=2) {
			arr[k]=i;
			k+=1;
		}
		i=i-2;
        if (i==n){
            i-=1;
        }
        else{
            i+=1;
        }
		
		for(int m=i;m>=2;m-=2) {
			arr[k]=m;
			k+=1;
		}
    }
    
    public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int cases=s.nextInt();
        
		for(int i=1;i<=cases;i++) {
			int len=s.nextInt();
            int[] arr=new int[len];
			arrange(arr,len);
		}
	}
}
