class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}