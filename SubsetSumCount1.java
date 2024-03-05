public class SubsetSumCount1 {
 static int countSubsetsWithDiff(int[] arr, int diff) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int subsetSum = (totalSum + diff) / 2;
        return countSubsets(arr, subsetSum);
    }

    static int countSubsets(int[] arr, int sum) {
        int n = arr.length;
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                dp[j] += dp[j - arr[i]];
            }
        }

        return dp[sum];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int diff = 1;
        System.out.println("Count of subsets with difference " + diff + ": " + countSubsetsWithDiff(arr, diff));
    }
}