class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[2];
        int a = 0, b = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                a++;
                    answer[0] = a;
            }
            else {
                b++;
                    answer[1] = b;
            }
            
        }
        
        return answer;
    }
}