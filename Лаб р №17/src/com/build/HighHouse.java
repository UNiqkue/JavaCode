package com.build;

import com.build.House;

public class HighHouse extends House {

    protected String material;
    protected int prolet;

    public HighHouse(String name, String place, int lenge, int weight, int height, int storey, String constr, int prolet, String material){}

    public HighHouse(String name, String place, int lenge, int weight, int height, int storey, int prolet, String material) {
        super(name, place, lenge, weight, height, storey, prolet);
        this.material = material;
        this.prolet = prolet;

    }


    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {

        return material;
    }

    public int square() {
        return super.lenge*super.weight;
    }

    public int[] roo(){
        int s = 100;
        int [] k = new int [s];
        for (int i = 0; i < s; i++){

            k[i] = 1 + (int) (Math.random() * 4);
        }
        return k;
    }

    public void max_height(String name) {
        this.name = name;
        if (this.name.equals("9 этажей")) {
            this.height = 20;
            System.out.println(20);
        }
        else if (this.name.equals("20 этажей")) {
            System.out.println(40);
            this.height = 40;
        }
        else if (this.name.equals("30 этажей")){
            System.out.println(60);
            this.height = 60;
        }

    }

    public int[] flat(){
        int [] k = new int [4];
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        for(int i = 0; i < roo().length; i++) {
            switch (roo()[i]) {
                case 1:
                    k[0]++;
                    break;
                case 2:
                    k[1]++;
                    break;
                case 3:
                    k[2]++;
                    break;
                case 4:
                    k[3]++;
                    break;

            }
        }
        return k;

    }

    public void cascad(String name){
        this.name = name;
        if (this.name.equals("Рядом с морем")) {
            this.material = "Балки, дерево";

        }
        else if (this.name.equals("Африка")) {
            this.material = "Балки, железо";
        }
        else if (this.name.equals("Беларусь")){
            this.material = "Бетон, кирпичи, цемент";
        }
    }

    @Override
    public String toString() {
        return "Высокоэтажка";
    }
}
