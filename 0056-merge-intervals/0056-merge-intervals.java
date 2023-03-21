class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        ArrayList<int[]> output = new ArrayList<>();
        
        int[] currentInterval = intervals[0];
        output.add(currentInterval);
        
        for(int i=1; i < intervals.length; i++){
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
        
            int[] nextInterval = intervals[i]; 
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];
            
            if(currentEnd >= nextStart){
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }else{
                currentInterval = intervals[i];
                output.add(currentInterval);
            }
        
    
        }
        return output.toArray(new int[output.size()][]);
    }
}