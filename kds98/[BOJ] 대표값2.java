import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int avg = 0;
        int middleValue;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg /= 5;

        Arrays.sort(arr);
        middleValue = arr[2];

        System.out.println(avg);
        System.out.println(middleValue);
    }
}