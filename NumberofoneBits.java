 class NumberOfOneBits {

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11; // Example input
        int count = hammingWeight(n);
        System.out.println("Number of 1 bits in " + n + ": " + count);
    }
}
