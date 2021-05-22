package com.geektech.players;

public class IronMan extends Avenger{

    int damacePoint = 5;

    public IronMan(int heajth, int damace, String name, EnumSuperAbility superAbility) {
        super(heajth, damace, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {

        for (int i = 0; i < avengers.length; i++) {

            if (avengers[i].getHeajth() > 0) {
                avengers[i].setDamace(avengers[i].getDamace() + damacePoint);
            }
        }
        System.out.println(" Damace up " + damacePoint);

    }
}
