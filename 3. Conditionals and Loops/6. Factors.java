import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}