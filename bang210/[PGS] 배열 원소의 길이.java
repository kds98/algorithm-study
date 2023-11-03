//문자열 배열 strlist가 주어질 때 각 원소의 길이를 담은 배열을 리턴하는 문제
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}