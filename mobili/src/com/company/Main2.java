package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader j = new BufferedReader(new InputStreamReader(System.in));
        int k, m, d, i;
        k = Integer.parseInt(j.readLine());
        m = Integer.parseInt(j.readLine());
        d = Integer.parseInt(j.readLine());
        int sum = k + m;
        for(i = 1; sum >= 0; i++, d++){
            if(d>=1 && d<=4){
                sum-=i;
                sum+=k;
            }else if(d>=5 && d<=7){
                sum-=i;
            }

            if(d==7){
                d = 0;
            }

        }
        System.out.println(i-2);

    }
}
