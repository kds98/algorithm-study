//삼각형의 세 변의 길이가 담긴 정수 배열이 주어질 때 삼각형이 이루어질 수 있는지 판별하는 문제

class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        if (sides[1] > max) max = sides[1];
        if (sides[2] > max) max = sides[2];
        int sum = sides[0] + sides[1] + sides[2];
        int answer = max < sum - max ? 1 : 2;
        return answer;
    }
}