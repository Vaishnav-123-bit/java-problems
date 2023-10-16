import java.util.Arrays;

public class MaxSubarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static int maxSubArray(int[] arr) {
        int currSum = 0;
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
