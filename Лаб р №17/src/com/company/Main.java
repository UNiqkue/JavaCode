package com.company;

import com.Err;
import com.Potok;
import com.build.House;
import com.crypto.Crypt;
import com.crypto.Decrypt;
import com.instruments.Instruments;
import com.team.Team;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Team brigada = new Team(20, "Строители", "Молотки", 150);
        try {
            FileWriter x = new FileWriter("F:/Java/count.txt");
            x.write(String.valueOf(brigada.getCount()));
            x.close();
            x=new FileWriter("F:/Java/type.txt");
            x.write(String.valueOf(brigada.getType()));
            x.close();
            x=new FileWriter("F:/Java/equipment.txt");
            x.write(String.valueOf(brigada.getEquipment()));
            x.close();
            x=new FileWriter("F:/Java/salary.txt");
            x.write(String.valueOf(brigada.getSalary()));
            x.close();

            String h = null;
            BufferedReader c = new BufferedReader(new FileReader("F:/Java/count.txt"));
            h=c.readLine();
            System.out.println(h);
            c.close();
            c = new BufferedReader(new FileReader("F:/Java/type.txt"));
            h=c.readLine();
            System.out.println(h);
            c.close();
            c = new BufferedReader(new FileReader("F:/Java/equipment.txt"));
            h=c.readLine();
            System.out.println(h);
            c.close();
            c = new BufferedReader(new FileReader("F:/Java/salary.txt"));
            h=c.readLine();
            System.out.println(h);
            c.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


