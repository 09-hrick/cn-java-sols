public class Solution{
    public static int duplicateNumber(int arr[]) {
        for(int i = 0; i < (arr.length - 1); ++i) { 
            for(int j = i + 1; j < arr.length; ++j) {
                if(arr[i] == arr[j]) { return arr[i]; 
                                     } 
            } 
        } 
        
        
        return Integer.MAX_VALUE; 
    }
}
