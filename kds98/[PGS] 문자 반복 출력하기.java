class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String stringRepeat = "";
        char[] charArray = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++) {
            stringRepeat = String.valueOf(charArray[i]);
            
            answer += stringRepeat.repeat(n);
        }
        
        return answer;
    }
}