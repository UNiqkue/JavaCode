package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader j = new BufferedReader(new InputStreamReader(System.in));
        int n, m, type;
        do {
            n = Integer.parseInt(j.readLine());
        } while (n < 2 && n > 2 * 10 * 10 * 10 * 10 * 10);
        int[] a = new int[n];
        int[] b = new int[n];
        int[] num = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(j.readLine());
        }
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(j.readLine());
        }
        do {
            m = Integer.parseInt(j.readLine());
        } while (m < 1 && m > 10 * 10 * 10 * 10 * 10);
        for (int i = 0; i < m; i++) {
            do {
                num[i] = Integer.parseInt(j.readLine());
                type = Integer.parseInt(j.readLine());
                d[i] = Integer.parseInt(j.readLine());
            } while (num[i] < 1 && num[i] > n && type < 1 && type > 2);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + b[i] + d[i]);
        }
    }
}
