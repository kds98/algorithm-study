package com.ll;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++){
            int num = scanner.nextInt();
            arr[i] += num;
            sum += num;
        }

        System.out.println(sum/5);
        Arrays.sort(arr);
        System.out.println(arr[2]);
        scanner.close();
    }
}

