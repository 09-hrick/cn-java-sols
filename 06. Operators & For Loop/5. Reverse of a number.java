import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int res=0;
		while(n>0) {
			int a=n%10;
			res=res*10+a;
			n=n/10;
		}
		System.out.println(res);
	}
}
