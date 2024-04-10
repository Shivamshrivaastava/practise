class MinElementInArray {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {10, 20, 4, 45, 99};

        // Function call to find the minimum element
        int min = findMin(arr);

        // Printing the minimum element
        System.out.println("The minimum element in the array is: " + min);
    }

    // Function to find the minimum element in the array
    public static int findMin(int[] arr) {
        // Initializing min to the first element of the array
        int min = arr[0];

        // Iterating through the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Returning the minimum element
        return min;
    }
}
