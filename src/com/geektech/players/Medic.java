package com.geektech.players;

public class Medic extends Avenger{

    private int healPoints;


    public Medic(int heajth, int damace, String name, EnumSuperAbility superAbility, int healPoints) {
        super(heajth, damace, name, superAbility);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {
        for (int i = 0; i < avengers.length; i++) {
            if (avengers[i].getHeajth() > 0 && avengers[i] != this){
                 avengers[i].setHeajth(healPoints + avengers[i].getHeajth());

            }
        }
        System.out.println(this.getName() + " to heal " + healPoints);
    }
}
