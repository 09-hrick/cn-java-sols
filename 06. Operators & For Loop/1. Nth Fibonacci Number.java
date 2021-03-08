import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int j=0;j<t;j++){
            int n=scan.nextInt();
            int a=1;
            int b=1;
            int c=1;
            for(int i=2;i<n;i++) {
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
	}

}
