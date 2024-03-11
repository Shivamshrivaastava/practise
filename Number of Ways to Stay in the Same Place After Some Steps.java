 class NumberOfWaysToStayInSamePlace {
    public static void main(String[] args) {
        int steps = 3;
        int arrLen = 2;
        
        int ways = numWays(steps, arrLen);
        
        System.out.println("Number of ways to stay in the same place after " + steps + " steps: " + ways);
    }

    public static int numWays(int steps, int arrLen) {
        int mod = 1000000007;
        int maxPos = Math.min(steps / 2, arrLen - 1);
        int[][] dp = new int[steps + 1][maxPos + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j <= maxPos; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod;
                }
                if (j < maxPos) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        return dp[steps][0];
    }
}
