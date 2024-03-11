import java.util.*;

class IntersectionOfTwoArrays {
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        
        int[] intersection = findIntersection(nums1, nums2);
        
        System.out.println("Intersection of the two arrays is: " + Arrays.toString(intersection));
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        int[] intersection = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            intersection[index++] = num;
        }
        
        return intersection;
    }
}
