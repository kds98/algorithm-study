class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] < answer && dot[1] < answer) {
            answer = 3;
        } else if(dot[0] < answer && dot[1] > answer) {
            answer = 2;
        } else if(dot[0] > answer && dot[1] > answer) {
            answer = 1;
        } else if(dot[0] > answer && dot[1] < answer) {
            answer = 4;
        }
        
        return answer;
    }
}