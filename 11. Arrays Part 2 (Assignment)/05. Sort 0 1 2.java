public class Solution {
    public static void sort012(int[] arr){
        int nextZero = 0;
        int nextTwo = arr.length - 1; 
        int i = 0;
        while(i <= nextTwo) {
            if(arr[i] == 0) { 
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp; i++;
                nextZero++;
            } 
            else if(arr[i]==2) { 
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i]; arr[i] = temp;
                nextTwo--; }
            else {
                i++; 
            }
        }
    } 
}