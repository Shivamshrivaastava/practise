 class Inverseofanarray {

    public static int[] findInverse(int[] array) {
        int n = array.length;
        int[] inverse = new int[n];
        for (int i = 0; i < n; i++) {
            inverse[array[i]] = i;
        }
        return inverse;
    }
    
    public static void main(String[] args) {
         int[] arr = {4, 0, 2, 1, 3};
        
        int[] inverse = findInverse(arr);

        System.out.println("Inverse of the array:");
        for (int i = 0; i < inverse.length; i++) {
            System.out.print(inverse[i] + " ");
        }
    }
}