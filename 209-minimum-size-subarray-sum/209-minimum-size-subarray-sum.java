class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart=0;
        int windowSum=0;
        int minWindowSize=Integer.MAX_VALUE;
        for(int windowEnd=0; windowEnd<nums.length;windowEnd++){
            windowSum+=nums[windowEnd];
            
            while(windowSum >= target){
                minWindowSize= Math.min(windowEnd - windowStart+1, minWindowSize);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        
        
        
        return minWindowSize == Integer.MAX_VALUE ? 0 : minWindowSize;
    }
}