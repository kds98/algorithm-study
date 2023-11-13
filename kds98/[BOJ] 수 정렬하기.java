import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        s.solution(array);
    }
}

class Solution {
    public int[] solution(int[] array) {

        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        return array;
    }
}
