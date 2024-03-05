class InvertedBarChart {

    public static void drawChart(int[] arr) {
        int max = findMax(arr);

        // Draw inverted bar chart
        for (int row = max; row >= 1; row--) {
            for (int col : arr) {
                if (col >= row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        drawChart(arr);
    }
}