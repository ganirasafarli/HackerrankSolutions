package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int lastAns = 0;
        List<List> seqList = new ArrayList();

        for (int i = 0; i < n; i++){
            seqList.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < q; i++){
            int t = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            List<Integer> seq = seqList.get((x^lastAns)%n);
            if (t==1){
                seq.add(y);
            } else {
                lastAns = seq.get(y%(seq.size()));
                System.out.println(lastAns);
            }
        }

        scanner.close();
    }
}