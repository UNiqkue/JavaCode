package com.build;

import com.build.Building;

public class House extends Building {

    protected int sq;

    public House(){}

    public House(String name, String place, int lenge, int weight, int height, int storey, int sq) {
        super(name, place, lenge, weight, height, storey);
        this.sq = sq;
    }

    public void setSq(int sq) {
        this.sq = sq;
    }

    public int getSq() {
        return sq;
    }

    public int square() {
        return super.lenge*super.weight;
    }

    public int rooms() {
        int room = 30;
        return square()/room;
    }

    public void max_height(String name) {
        this.name = name;
        if (this.name == "Один этаж") {
            this.height = 2;
            System.out.println(2);
        }
        else if (this.name == "Один этаж с крышей") {
            System.out.println(3);
            this.height = 3;
        }
        else if (this.name == "Два этажа с крышей"){
            System.out.println(5);
            this.height = 5;
        }

    }

    public int uvel(){
        return this.sq+=this.sq;
    }


    @Override
    public String toString() {
        return "Частный дом";
    }
}
