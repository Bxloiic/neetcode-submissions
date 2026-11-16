class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int countTracker = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                counter++;
            } else if (nums[i] == 0){
                if (counter > countTracker){
                    countTracker = counter;
                } 
                counter = 0;//reset counter cause 
            }

            //check again but for the case when theres no breaks after a 0
            if (counter > countTracker){
                countTracker = counter;
            } 
        }
        return countTracker;//return highest consecutive number of 1's 
    }
}