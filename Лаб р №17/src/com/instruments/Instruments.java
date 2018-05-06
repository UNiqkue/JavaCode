package com.instruments;

import java.util.Scanner;

public class Instruments {

    private int count;
    private String type;
    private String exploitation;
    private int cost;

    public Instruments() {
    }

    public Instruments(int count, String type, String exploitation, int cost) {
        this.count = count;
        this.type = type;
        this.exploitation = exploitation;
        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExploitation(String exploitation) {
        this.exploitation = exploitation;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getExploitation() {
        return exploitation;
    }

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public int buy() {
        int count;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество инструментов");
        count = scan.nextInt();
        System.out.println("Сколько ещё надо докупить?");
        int n = scan.nextInt();
        this.count = count + n;
        return this.count;
    }

    public int buy(int count) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Сколько ещё надо докупить?");
        int n = scan.nextInt();
        this.count = count + n;
        return this.count;
    }

    public int buy(int count, int n) {
        return this.count = count + n;
    }

    public void buy(int... n) {
        int count = 100;
        for (int i = 0; i < n.length; i++){
            this.count = count + n[i];
            System.out.println( (i+1) + "-й неделя кол-во интрументов " + this.count);
        }
    }

    public int destroy() {
        int count, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество инструментов");
        count = scan.nextInt();
        do {
            System.out.println("Сколько инструментов сломалось?");
            n = scan.nextInt();
            this.count = count - n;
            if (count < n) {
                System.out.println("Вы сломали инструментов больше, чем у вас было!!!");
            }
        } while (count < n);
        return this.count;
    }

    public int destroy(int count) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Сколько инструментов сломалось?");
        n = scan.nextInt();
        this.count = count - n;

        return this.count;
    }

    public int destroy(int count, int n) {
        return this.count = count - n;
    }

    public void destroy(int... n) {
        int count = 100;
        for (int i = 0; i < n.length; i++){
            this.count = count - n[i];
            System.out.println( (i+1) + "-й день осталось инструментов " + this.count);
        }
    }

    public int wasted() {
        return this.cost * this.count;
    }

    public void add_eq() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дополнительные условия эксплуатации: ");
        String dop = scan.nextLine();

        this.exploitation = this.exploitation + dop;
        System.out.println("Успешно\n" + this.exploitation);
    }

    @Override
    public String toString() {
        return "Instruments{" +
                "count=" + count +
                ", type='" + type + '\'' +
                ", exploitation='" + exploitation + '\'' +
                ", cost=" + cost +
                '}';
    }
}
