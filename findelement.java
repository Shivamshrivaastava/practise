class FindElement {
    public static int findElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target element if found
            } else if (arr[mid] < target) {
                left = mid + 1; // Continue searching in the right half
            } else {
                right = mid - 1; // Continue searching in the left half
            }
        }

        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        int[] arr = {6, 15, 30, 40, 4, 11, 9, 40};
        int target = 6;

        int index = findElement(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
