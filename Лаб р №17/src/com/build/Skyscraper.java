package com.build;

import com.build.HighHouse;

public class Skyscraper extends HighHouse {

    protected String constr;

    Skyscraper(String name, String place, int lenge, int weight, int height, int storey,  String constr, int prolet, String material) {
        super(name, place, lenge, weight, height, storey, constr, prolet, material);
        this.constr = constr;
    }

    public String getConstr() {

        return constr;
    }

    public int square() {
        return super.lenge*super.weight;
    }

    public int rooms() {
        int room = 35;
        return square()/room;
    }

    public void max_height(String name) {
        this.name = name;
        if (this.name.equals("Эмпаер Билдинг")) {
            this.height = 350;
            System.out.println(350);
        }
        else if (this.name.equals("Китай-Башня")) {
            System.out.println(500);
            this.height = 500;
        }
        else if (this.name.equals("Бурдж Халифа")){
            System.out.println(950);
            this.height = 950;
        }

    }

    public int amply_height(int n){
        return super.height+=n;
    }

    public void output(){
        this.material="Зеркальные окна, 1000000 дверей, выхода из них нет, одни офисы, работают 24 часа в сутки";
    }

    @Override
    public String toString() {
        return "Небоскрёб";
    }

}
