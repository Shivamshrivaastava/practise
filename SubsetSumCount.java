
public class SubsetSumCount {
    public static int countSubsets(int[] arr, int sum) {
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];

        // Base case: If sum is 0, then there is one subset with sum 0 (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10};
        int sum = 16;
        System.out.println("Number of subsets with sum " + sum + ": " + countSubsets(arr, sum));
    }
}
