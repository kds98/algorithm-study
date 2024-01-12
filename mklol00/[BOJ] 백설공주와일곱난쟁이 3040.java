import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        int notNan1 = 0;
        int notNan2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    notNan1 = arr[i];
                    notNan2 = arr[j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(notNan1 == arr[i] || notNan2 == arr[i]) continue;
            System.out.println(arr[i]);
        }

    }
}
