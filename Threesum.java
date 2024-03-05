import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = nums.length - 1;
                int currentTarget = target - nums[i];

                while (left < right) {
                    if (nums[left] + nums[right] == currentTarget) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < currentTarget) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> triplets = threeSum(nums, target);
        System.out.println("Triplets that sum up to " + target + ": " + triplets);
    }
}
