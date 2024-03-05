 class JumpGame {
    public static boolean canJump(int[] nums) {
        int maxReachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i>maxReachable) {
                return false;
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
            if(maxReachable>=nums.length-1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
