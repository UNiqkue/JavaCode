package com.team;

import java.util.Scanner;

public class Team {

    private int count;
    private String type;
    private String equipment;
    private int salary;

    public Team() {
    }

    public Team(int count, String type, String equipment, int salary) {
        this.count = count;
        this.type = type;
        this.equipment = equipment;
        this.salary = salary;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int employ() {
        int count = this.count;
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько нанять рабочих?");
        int n = scan.nextInt();
        this.count = count + n;
        return this.count;
    }

    public int employ(int n) {
        int count = this.count;
        return this.count = count + n;
    }

    public int employ(int n, int count) {
        return this.count = count + n;
    }

    public void  employ(int... n) {
        int count = 100;
        for (int i = 0; i < n.length; i++){
            this.count = count + n[i];
            System.out.println( (i+1) + "-й день кол-во рабочих " + this.count + ", нанято " + n[i]);
        }
    }

    public int fire() {
        int count = this.count;
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Сколько уволить рабочих?");
            n = scan.nextInt();
            this.count = count - n;
            if (count <= n) {
                System.out.println("Вы уволили больше рабочих, чем у вас в бригаде. У вас должна быть команда!!!");
            }
        } while (count <= n);
        return this.count;

    }

    public int fire(int n) {
        int count = this.count;
        this.count = count - n;
        return this.count;

    }

    public int fire(int n, int count) {
        return this.count = count - n;

    }

    public void  fire(int... n) {
        int count = 100;
        for (int i = 0; i < n.length; i++){
            this.count = count - n[i];
            System.out.println( (i+1) + "-й день всего рабочих " + this.count + ", уволено " + n[i]);
        }
    }

    public int bonus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вознаграждение, премию:");
        int prize = scan.nextInt();
        this.salary += prize;
        return this.salary;
    }

    public int cut() {
        this.salary -= 5;
        return this.salary;
    }

    public int cut(int n) {
        this.salary -= n;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Team{" +
                "count=" + count +
                ", type='" + type + '\'' +
                ", equipment='" + equipment + '\'' +
                ", salary=" + salary +
                '}';
    }
}

