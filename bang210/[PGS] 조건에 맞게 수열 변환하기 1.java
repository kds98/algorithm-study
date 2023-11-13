import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.stream(arr)
                        .map(num -> { if (num >= 50 && num % 2 == 0) {
                                return num /= 2;
                            } else if (num < 50 && num % 2 == 1) {
                                return num *= 2;
                            } else {
                                return num;
                            }
                        })
                        .toArray();
        return answer;
    }
}