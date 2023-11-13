//문자열 message가 주어질 때 필요한 편지지의 길이(글자당 2cm)를 구하는 문제

class Solution {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}