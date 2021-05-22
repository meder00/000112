package com.geektech.game;

import com.geektech.players.*;

public class InfinityWar {

    private static int round = 0;

    public static void startBattle(){

        Boss thanos = new Boss(2500,50,"Thanos");

        CaptainAmeica captainAmeica = new CaptainAmeica(250,25,"CaptainAmeica",
                EnumSuperAbility.SHIELD_DAMACE);

        IronMan ironMan = new IronMan(220,30,"IronMan",EnumSuperAbility.TO_FLY);

        Hulk hulk = new Hulk(300,35,"Hulk",EnumSuperAbility.ALL_CRASH);

        Medic doc = new Medic(200,0,"Doctor",EnumSuperAbility.TO_HEAL, 10);

        Medic assistans = new Medic(230,0,"assistans",EnumSuperAbility.TO_HEAL, 5);

        Avenger[] avengers = {captainAmeica,ironMan,hulk,doc,assistans};

        System.out.println("_____THE INFINITY STARTED_____");

        printStatistcs(thanos,avengers);

        while (!isGameFinished(thanos,avengers)){

            round(thanos, avengers);
        }

    }

    private static void round(Boss thanos, Avenger[] avengers) {
        round++;
        System.out.println("_____ ROUND " +  round + "_______");
        thanosDamace(thanos, avengers);
        avengersDamace(thanos, avengers);
        applySuperAbility(thanos, avengers);
        printStatistcs(thanos, avengers);

    }

    private static void applySuperAbility(Boss thanos, Avenger[] avengers) {
        for (int i = 0; i < avengers.length; i++) {
            if (thanos.getHeajth() > 0 && avengers[i].getHeajth() > 0 ){
                avengers[i].applySuperAbility(thanos, avengers);
            }
        }
    }

    private static boolean isGameFinished(Boss thanos, Avenger[] avengers){

        if (thanos.getHeajth() <= 0){
            System.out.println("_____Avengera Won_____");
            return true;
        }
        boolean allAvengeraDead = true;
        for (Avenger avenger:avengers) {
            if (avenger.getHeajth() > 0){
                allAvengeraDead = false;

            }
        }
        if (allAvengeraDead){
            System.out.println(" _____Thanos Won_____");
        }
        return allAvengeraDead;
    }

    private static void thanosDamace(Boss thanos, Avenger[] avengers){

        for (int i = 0; i < avengers.length; i++) {
            if (thanos.getHeajth() > 0 && avengers[i].getHeajth() > 0){
                avengers[i].setHeajth(avengers[i].getHeajth() - thanos.getDamace());

            }

        }
    }private static void avengersDamace(Boss thanos, Avenger[] avengers){

        for (int i = 0; i < avengers.length; i++) {
            if (thanos.getHeajth() > 0 && avengers[i].getHeajth() > 0){
               thanos.setHeajth(thanos.getHeajth() - avengers[i].getDamace());

            }
        }
    }



    private static void printStatistcs(Boss thanos, Avenger[] avengers){

        System.out.println(thanos.getName() + " : " + thanos.getHeajth() + " damace " + thanos.getDamace());

        for (int i = 0; i < avengers.length; i++) {
            System.out.println(avengers[i].getName() + " : " + avengers[i].getHeajth() +
                    " damace "  + avengers[i].getDamace());

        }
        System.out.println("_____________________________");
    }
}
