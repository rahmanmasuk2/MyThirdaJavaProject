package com.infix.qa.masuk;

public class Opeators {
    public static void main (String [] masuk){
        System.out.println("Arithmetic operation...");
        operators();




    }
    public static void operators(){
        int intnumone = 40;
        int intnumtwo = 20;
        System.out.println(intnumone + intnumtwo);

        double doublenumone = 40.00;
        double doublenumtwo = 6.00;

        System.out.println("Reminder;" + " " + intnumone % intnumtwo);
        System.out.println(doublenumone/doublenumtwo);
    }


}
