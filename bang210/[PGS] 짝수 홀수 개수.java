//정수 배열 num_list가 주어질 때 담겨있는 짝수와 홀수의 개수를 담은 배열을 리턴하는 문제
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}