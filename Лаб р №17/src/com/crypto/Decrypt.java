package com.crypto;

public class Decrypt {

    private String keyfull;
    private String keybegin="";

    public Decrypt(String key){
        this.keybegin=key;
    }

    public String getKeybegin() {
        return keybegin;
    }

    public void setKeybegin(String keybegin) {
        this.keybegin = keybegin;
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

    public void FillingKey(String Cryptotext){
        this.keyfull="";
        for(int i=0, j=0; i<Cryptotext.length(); i++, j++){
            if(j==this.keybegin.length()-1)
                j=0;
            this.keyfull+=this.keybegin.charAt(j);
        }
    }

    public String decrypt(String text) {
        char[] nText = new char[text.length()];
        FillingKey(text);
        int k;
        int t;
        char[][] table = genTable();

        for (int i = 0; i < text.length(); i++) {
            k = (int)this.keyfull.charAt(i) - 97;
            t = (int)text.charAt(i) - 97;
            if (k > t) {
                nText[i] = table[26 + (t - k)][0];
            } else {
                nText[i] = table[t - k][0];
            }
        }
        return new String(nText);
    }
}

