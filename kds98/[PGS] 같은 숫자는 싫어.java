import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] answer;

        for (int i : arr) {
            if (st.isEmpty() || st.peek() != i) {
                st.push(i);
            }
        }
        answer = new int[st.size()];

        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
        
        return answer;
    }
}