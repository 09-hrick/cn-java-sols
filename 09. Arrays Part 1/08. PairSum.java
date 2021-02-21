public class Solution { 
    public static int pairSum(int arr[], int x) {
        int numPairs = 0; for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) { if(arr[i] + arr[j] == x) {
                numPairs += 1; } } } return numPairs;
    }
}
