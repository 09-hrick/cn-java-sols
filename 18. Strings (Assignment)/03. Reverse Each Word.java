
public class Solution {

	public static String reverseEachWordBetter(String input) {
		// Write your code here
        input+=" ";
        String out="";
        String s = "";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == ' '){
                
                out+= s+" ";
                s="";
            }
            else{
                s =  input.charAt(i)+ s;
            }
        }
		return out;
	}
	
	
	public static String reverseEachWord(String str) {
		
		String x="";
		int spaceIndex=0;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() ||  str.charAt(i)==' ' ) {
				x=x+reverse(str.substring(spaceIndex,i))+" ";
				spaceIndex=i+1;
			}
		}
		return x;
		
	}
	private static String reverse(String str) {
		String x="";
		for(int i=str.length()-1;i>=0;i--)
			x=x+str.charAt(i);
		return x;
	}
	public static void main(String[] args) {
		String str="Welcome to Coding Ninjas";
		System.out.println(reverseEachWord(str));
	}

}