package com.company;

import java.util.Scanner;

class Result {
    public static void rotateLeft(int d, int[] arr) {
        for (int j = 0; j < d; j++) {
            int k = arr[0];
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            arr[arr.length - 1] = k;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Result.rotateLeft(d, arr);
    }
}