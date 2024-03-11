 class MinimumCommonValue {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        int minCommonValue = findMinCommonValue(array1, array2);
        
        if (minCommonValue != Integer.MAX_VALUE) {
            System.out.println("Minimum common value is: " + minCommonValue);
        } else {
            System.out.println("No common value found");
        }
    }

    public static int findMinCommonValue(int[] array1, int[] array2) {
        int minCommonValue = Integer.MAX_VALUE;
        boolean foundCommon = false;
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    minCommonValue = Math.min(minCommonValue, array1[i]);
                    foundCommon = true;
                }
            }
        }
        
        if (!foundCommon) {
            minCommonValue = Integer.MAX_VALUE; // No common value found
        }
        
        return minCommonValue;
    }
}
