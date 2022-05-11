class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashSet<Character> set = new HashSet();
        int start=0;
        int end= 0;
        int maxSize = 0; 
        
        while(end < s.length()){
            char rightChar = s.charAt(end);
            if(!set.contains(rightChar)){
                set.add(rightChar);
                end++;
                maxSize = Integer.max(maxSize,  set.size());
            }else{
                char leftChar = s.charAt(start);
                set.remove(leftChar);
                start++;
            }
            
            
            
        }
        return maxSize;
    }
}