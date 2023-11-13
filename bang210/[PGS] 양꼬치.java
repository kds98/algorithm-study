package com.ll;

//양꼬치(12000원)의 개수 n과 음료수(2000)원의 개수 k가 주어짐
//양꼬치 10인분을 먹으면 음료수 1개를 서비스로 줄 때, 가격을 구하는 문제
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int bonus = n / 10;
        if (bonus >= k) {
            k = 0;
        } else {
            k -= bonus;
        }
        answer = n * 12000 + k * 2000;
        return answer;
    }
}