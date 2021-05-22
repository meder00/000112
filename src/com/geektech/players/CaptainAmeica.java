package com.geektech.players;

public class CaptainAmeica extends Avenger{



    public CaptainAmeica(int heajth, int damace, String name, EnumSuperAbility superAbility) {
        super(heajth, damace, name, superAbility);

    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers){
        for (int i = 0; i < avengers.length; i++) {
            if  (avengers[i] == this){
                avengers[i].setDamace(thanos.getDamace() / 5 + avengers[i].getDamace());

            }

        }

    }
}