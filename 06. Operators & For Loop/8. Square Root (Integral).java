import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=0,sq=0;
		while(i*i<=n) {
			sq=i;
			i++;
		}

		System.out.println(sq);

	}
}
