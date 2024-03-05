import java.util.ArrayList;
import java.util.List;

 class MyClass {

 
    public static List<List<Integer>> findSubsets(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initialize first column as true. 0 sum is possible
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        // Initialize top row, except dp[0][0], as false. No sum is possible with 0 elements other than 0
        for (int i = 1; i <= sum; i++)
            dp[0][i] = false;

        // Fill dp[][] in bottom-up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        // List to store all subsets with given sum
        List<List<Integer>> subsets = new ArrayList<>();

        // If dp[n][sum] is false, then no subset with given sum exists
        if (!dp[n][sum]) {
            System.out.println("No subset with given sum exists");
            return subsets;
        }

        // Fill subsets using dp[][]
        fillSubsets(arr, n, sum, new ArrayList<>(), dp, subsets);
        return subsets;
    }

    // Function to fill all subsets with given sum
    private static void fillSubsets(int[] arr, int i, int sum, List<Integer> subset,
                                    boolean[][] dp, List<List<Integer>> subsets) {
        // If we reached end and sum is non-zero and subset is not already present
        if (i == 0 && sum != 0 && dp[0][sum]) {
            subset.add(arr[i]);
            subsets.add(new ArrayList<>(subset));
            subset.clear();
            return;
        }

        // If sum becomes 0, store current subset
        if (i == 0 && sum == 0) {
            subsets.add(new ArrayList<>(subset));
            return;
        }

        // If given sum can be achieved after ignoring current element
        if (dp[i - 1][sum]) {
            List<Integer> temp = new ArrayList<>(subset);
            fillSubsets(arr, i - 1, sum, temp, dp, subsets);
        }

        // If given sum can be achieved after considering current element
        if (sum >= arr[i - 1] && dp[i - 1][sum - arr[i - 1]]) {
            subset.add(arr[i - 1]);
            fillSubsets(arr, i - 1, sum - arr[i - 1], subset, dp, subsets);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        List<List<Integer>> subsets = findSubsets(arr, sum);

        // Printing all subsets with given sum
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}