class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int s = nums.length - 1;
        for (int i = 0; i < s; i ++){
            if (nums[i] == nums[i+1]){
                 count++;
                 if (count >= 1)
                    return true;
            
            }
        }
        return false;
    }
}