class Solution {
    public int numberOfSteps(int num) {
        int count =0;
        return help(num, count);
        
    }
    public int help(int n, int count){
        if(n==0)return count;
        if(n%2==0){
            return help(n/2, count+1);
        }else{
            return help(n-1, count+1);
        }
    }
}