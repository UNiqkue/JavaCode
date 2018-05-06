package com.crypto;

import java.util.ArrayList;
import java.util.Scanner;
import  java.io.PrintWriter;

public class Crypt {

    private String keyfull;
    private String keybegin="";

    public Crypt(){}

    public Crypt(String key){
        this.keybegin += key;
    }

    public void FillingKey(String Cryptotext) {
        this.keyfull = "";
        try {
            for (int i = 0, j = 0; i < Cryptotext.length(); i++, j++) {
                if (j == this.keybegin.length() - 1)
                    j = 0;
                this.keyfull += this.keybegin.charAt(j);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out stroka ");
        } finally {
            for (int i = 0, j = 0; i < Cryptotext.length(); i++, j++) {
                if (j == this.keybegin.length() - 1)
                    j = 0;
                this.keyfull += this.keybegin.charAt(j);
            }
            System.out.println("Key is full " + this.keyfull);
        }
    }

    private static char[][] genTable() {
        char[][] table = new char[26][26];

        for (int i = 0; i < 26; i++) {
            int off = i;

            for (int j = 0; j < 26; j++) {

                if(off == 26) {
                    off = 0;
                }
                table[i][j] = (char)(97 + off);
                off++;
            }
        }
        return table;
    }

    public String encrypt(String text) {
        char[] nText = new char[text.length()];
        FillingKey(text);
        int k;
        int t;
        char[][] table = genTable();

        for (int i = 0; i < text.length(); i++) {
            k = (int)this.keyfull.charAt(i) - 97;
            t = (int)text.charAt(i) - 97;
            nText[i] = table[k][t];

        }
        return new String(nText);
    }

    public void palindrom(){
        String line;
        int num = 0;
        String [] linearr;

        System.out.println("Введите строку:");

        Scanner s = new Scanner(System.in);

        line = s.nextLine();
        //linearr = line.split("\\s");
        linearr = splidi(line);

        int[] scNumbers = new int[linearr.length];

        for(int i = 0; i < linearr.length; i++){
            for(int j = i +1; j < linearr.length; j++){
                if(solve(linearr[i], linearr[j])){
                    System.out.println( linearr[i] + " " + linearr[j]);
                    num++;
                }
            }
        }

        if(num==0){
            System.out.println("Таких слов не найдено ");
        } else System.out.println("Таких слов всего " + num);


    }

    static boolean solve(String S, String S1){
        StringBuilder SS = new StringBuilder(S);
        SS = SS.reverse();
        return S1.equals(SS.toString());
    }

     public static String[] splidi(String S){
        ArrayList<String> tmp = new ArrayList<String>();
        int i = 0;

        for (int j = 0; j < S.length(); j++) {
            if (S.charAt(j) == ' ') {
                if (j > i) {
                    tmp.add(S.substring(i, j));
                }
                i = j + 1;
            }

        }

        if (i < S.length()) {
            tmp.add(S.substring(i));
        }

        String[] w = tmp.toArray(new String[tmp.size()]);
        return w;
    }

}
