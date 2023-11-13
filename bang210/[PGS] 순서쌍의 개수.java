//자연수 n이 주어질 때 곱해서 n이 되는 자연수 순서쌍의 개수를 구하는 문제

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {answer++;}
        }
        return answer;
    }
}