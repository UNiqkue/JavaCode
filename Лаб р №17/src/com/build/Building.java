package com.build;

import com.build.Construction;

abstract class Building implements Construction {

    protected String name;
    protected String place;
    protected int weight;
    protected int lenge;
    protected int height;
    protected int storey;

    public Building() {}

    public Building(String name, String place, int lenge, int weight, int height, int storey) {
        this.name = name;
        this.place = place;
        this.lenge = lenge;
        this.weight = weight;
        this.height = height;
        this.storey = storey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setLenge(int lenge) {
        this.lenge = lenge;
    }

    public int getLenge() {
        return lenge;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getStorey() {
        return storey;
    }

    public void setStorey(int storey) {
        this.storey = storey;
    }


    public int square() {
        return this.lenge*this.weight;
    }

    public double height_storey() {
        return (double) this.height/this.storey;
    }

    public int max_height() {
        if (this.name == "Частный дом")
            this.height = 10;
        else if (this.name == "Высокоэтажка")
            this.height = 100;
        else if (this.name =="Небоскрёб")
            this.height = 828;
        return this.height;
    }

    public void max_height(String name) {
        this.name = name;
        if (this.name == "Частный дом") {
            this.height = 10;
            System.out.println(10);
        }
        else if (this.name == "Высокоэтажка") {
            System.out.println(100);
            this.height = 100;
        }
        else if (this.name == "Небоскрёб"){
            System.out.println(828);
            this.height = 828;
        }

    }


    public int rooms() {
        int room = 50;
        return square()/room;
    }

    public int rooms(int sqroom) {
        return square()/sqroom;
    }

    public int[] rooms(int... sqroom){
        for (int i = 0; i < sqroom.length; i++){
            System.out.println( (i+1) + "-й этаж - кабинетов " + square()/sqroom[i]);
        }
        return new int[0];
    }

    @Override
    public String toString() {
        return "Construction{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", lenge=" + lenge +
                ", weight=" + weight +
                ", height=" + height +
                ", storey=" + storey +
                '}';
    }
}


