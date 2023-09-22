package by.bsuir.main.task5;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int k = findTheNumberOfElementsToRemove(arr);
        System.out.println(k);
    }
    public static int findTheNumberOfElementsToRemove(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int[] dp = new int[arr.length];
        int maxLength = 1;
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return arr.length - maxLength;
    }
}
