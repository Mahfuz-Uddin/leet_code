class Solution {
    public int romanToInt(String s) {
        int total=0;
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);
       
        for(int i=0;i<s.length(); i++){
            if(i+1<s.length() && symbols.get(s.charAt(i)) < symbols.get(s.charAt(i+1))){
                total = total - symbols.get(s.charAt(i));
            }
            else{
                total = total + symbols.get(s.charAt(i));
            }
        }
        
        return total;
    }
}