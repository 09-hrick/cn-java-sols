import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=(n-i+1);j++) {
				System.out.print(n-i+1);
			}
			System.out.println();
		}
		
	}

}
