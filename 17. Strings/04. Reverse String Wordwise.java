import java.util.Scanner;
public class Solution {
	public static String reverseWordWise(String input) {
int end = input.length() - 1,start,j;
		String result ="",word = "";
		for(int i= input.length() - 1;i >= 0;i--) {
			if(input.charAt(i) == ' ') {
				start = i + 1;
				word = "";
				for(j = start;j <= end;j++) {
					word += input.charAt(j);
				}
				end  = i - 1;
				result = result + word + " ";
			}
		}
		word = "";
		for(j = 0;j <= end;j++) {
			word = word + input.charAt(j);
		}
		result += word;
		return result;
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			String str1 = reverseWordWise(str);
System.out.print(str1); 
	}
}