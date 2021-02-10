import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		int i=1;
		while(count<=n) {
			int sum=3*i+2;
			if(sum%4!=0) {
				System.out.print(sum+" ");
				count++;
			}
			i++;
		}

	}
}
