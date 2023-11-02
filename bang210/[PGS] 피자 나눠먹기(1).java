//n명이 7조각의 피자를 나눠먹을 때 각1조각 이상씩 먹기 위한 피자의 최소 판수를 구하는 문제

class Solution {
    public int solution(int n) {
        int body;
        int rest;
        body = n / 7;
        rest = n % 7;
        int answer = rest == 0 ? body : body + 1;
        return answer;
    }
}