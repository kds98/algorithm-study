import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        answer.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                answer.add(n / 2);
                n /= 2;
            } else {
                answer.add(3 * n + 1);
                n = 3 * n + 1;
            }
        }
        
        int[] array = new int[answer.size()];
        
        for(int i = 0; i < answer.size(); i++) {
            array[i] = answer.get(i);
        }
        
        return array;
    }
}
