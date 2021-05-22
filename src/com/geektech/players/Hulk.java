package com.geektech.players;

import java.util.Random;

public class Hulk extends Avenger{

    public Hulk(int heajth, int damace, String name, EnumSuperAbility superAbility) {
        super(heajth, damace, name, superAbility);
    }
    Random random = new Random();
    int randomNumber = random.nextInt(3) + 2;

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {
        if (this.getHeajth() > 0 ){
            this.setDamace(this.getDamace() * randomNumber);
        }
        System.out.println(" Super damace " + randomNumber);
    }
}



