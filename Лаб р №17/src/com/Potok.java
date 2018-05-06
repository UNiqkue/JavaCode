package com;
import com.company.Main;
public class Potok extends Thread {

    public Potok(){}

    public Potok(String qwerty){
        super(qwerty);
    }


  /* public synchronized void run(){
       System.out.println("Hello поток - " + super.getName());
        Main.mess(super.getName());
       //System.out.println("  Good bye поток - " + super.getName());
   }
*/
}
