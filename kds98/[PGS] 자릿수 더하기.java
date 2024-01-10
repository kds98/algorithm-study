class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = n;
        int length = (temp == 0) ? 1 : (int) Math.log10(temp) + 1;
        int[] array = new int[length];
        
        for(int i = 0; i < length; i++) {
            array[i] = temp % 10;
            temp /= 10;
        }
        
        for(int i = 0; i < length; i++) {
            answer += array[i];
        }
        
        return answer;
    }
}