public class ReverseBits {

    public static int reverseBits(int n) {
        int reversed = 0;
        int bitsCount = 32; // Assuming integers are represented using 32 bits

        for (int i = 0; i < bitsCount; i++) {
            reversed = (reversed << 1) | (n & 1); // Shift reversed left by 1 and OR with the least significant bit of n
            n >>= 1; // Shift n right by 1 to consider the next bit
        }

        return reversed;
    }

    public static void main(String[] args) {
        int n = 43261596;
        System.out.println("Original number: " + n);
        int reversed = reverseBits(n);
        System.out.println("Reversed number: " + reversed);
    }
}
