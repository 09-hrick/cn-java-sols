public class Solution { 
    public static int secondLargestElement(int[] arr) { 
        if (arr.length == 0) { 
            return Integer.MIN_VALUE; 
        } 
        int largest = arr[0], secondLargest = Integer.MIN_VALUE; 
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest; largest = arr[i];
            } 
            else if (secondLargest < arr[i] && arr[i] != largest){
                secondLargest = arr[i]; 
            }
        } 
        return secondLargest;
    }
}