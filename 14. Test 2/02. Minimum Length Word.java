
public class Solution {

	public static String minLengthWord(String str) {
		
		int spaceIndex=0;
		int startIndex=0;
		int endIndex=0;
		int minLength=Integer.MAX_VALUE;
		for(int i=0;i<=str.length();i++) {
			
			if(i==str.length() || str.charAt(i)==' ' ) {
				int length= i-spaceIndex;
				if(minLength > length) {
					minLength=length;
					startIndex=spaceIndex;
					endIndex=i;
				}
				spaceIndex=i+1;
			}
        }
		return str.substring(startIndex,endIndex);
    }
		
	}