

 class MaxElementInArray {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {10, 20, 4, 45, 99};

        // Function call to find the maximum element
        int max = findMax(arr);

        // Printing the maximum element
        System.out.println("The maximum element in the array is: " + max);
    }

    // Function to find the maximum element in the array
    public static int findMax(int[] arr) {
        // Initializing max to the first element of the array
        int max = arr[0];

        // Iterating through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

       
        return max;
    }
}
