class CountWaysToCoverDistance {

    public static int countWays(int dist) {
        int[] dp = new int[dist + 1];
        dp[0] = 1; 

        for (int i = 1; i <= dist; i++) {
            dp[i] += dp[i - 1];
            if (i >= 2) dp[i] += dp[i - 2];
            if (i >= 3) dp[i] += dp[i - 3];
        }

        return dp[dist];
    }

    public static void main(String[] args) {
        int dist = 9;
        System.out.println("Number of ways to cover distance " + dist + ": " + countWays(dist));
    }
}
