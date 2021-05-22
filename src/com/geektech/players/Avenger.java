package com.geektech.players;

public abstract class Avenger extends GameEntity implements SuperaAbility{

    private EnumSuperAbility superAbility;

    public Avenger(int heajth, int damace, String name, EnumSuperAbility superAbility) {
        super(heajth, damace, name);
        this.superAbility = superAbility;

    }
}
