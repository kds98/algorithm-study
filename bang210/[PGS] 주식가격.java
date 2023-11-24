class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            answer[i] = 0;
            for (int j = 0; j < prices.length - i - 1; j++) {
                if (prices[i+j] >= prices[i]) {
                    answer[i]++;
                } else {
                    break;
                }
            }
        }

        return answer;
    }
}