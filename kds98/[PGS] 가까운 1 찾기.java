class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        
        for(int i = arr.length - 1; i >= idx; i--) {
            if(arr[i] == 1) {
                answer = i;
            }
        }
        
        return answer;
    }
}