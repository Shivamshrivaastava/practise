class ArraySpan {
    public static int findSpan(int[] arr) {
        
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        
        // Find the maximum and minimum elements in the array
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        
        // Return the difference between maximum and minimum elements
        return max - min;
    }
    
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 10, 6, 5, 7};
        int span = findSpan(arr);
        System.out.println("Span of the array: " + span);
    }
}
