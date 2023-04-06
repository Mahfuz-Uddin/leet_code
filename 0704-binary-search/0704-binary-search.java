class Solution {
    public int search(int[] nums, int target) {
   
        return helper(nums, target, 0, nums.length-1);
    }
    
    public int helper(int[] nums, int target, int left, int right){
        int mid=left + (right-left)/2;
        if(left>right)return -1;
        if(target==nums[mid]){
            return mid;
        }else if(target<nums[mid]){
            return helper(nums, target, left, mid-1);
        }else{
            return helper(nums,target,mid+1, right);
        }
    }
}