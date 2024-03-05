public class CountingBits {

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        
        // Base case
        result[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            // Use the previously calculated result for i/2 and add 1 if i is odd
            result[i] = result[i >> 1] + (i & 1);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] counts = countBits(n);

        System.out.println("Counts of set bits for numbers from 0 to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}
