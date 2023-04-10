class Solution {
    public void sortColors(int[] nums) {
        sort(nums, nums.length-1, 0);
        
    }
    public void sort(int[] nums, int i, int j){
        if(i==0)return;
        if(i>j){
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j]= nums[j+1];
                nums[j+1] = temp;
            }
            sort(nums, i, j+1);
        }else{
            sort(nums, i-1,0);
        }
    }
}
