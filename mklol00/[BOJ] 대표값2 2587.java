import java.util.Arrays;
import java.util.Scanner;

public class _2587_대표값2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int hap = 0;
        int avg = 0;
        int i = 0;
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            hap += arr[i];
        }
        avg = hap / i;
        System.out.println(avg);
        Arrays.sort(arr);
        System.out.println(arr[2]);

    }
}