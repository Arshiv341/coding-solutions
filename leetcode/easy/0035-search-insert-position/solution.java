class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx=1;
        int prev=0;
        while(idx<nums.length){
            if(target>=nums[prev] && target<nums[idx]){
                return prev;
            }
            prev++;
            idx++;
        }
        return nums.length;
    }
}