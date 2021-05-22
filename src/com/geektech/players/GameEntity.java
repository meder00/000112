package com.geektech.players;

public abstract class GameEntity {
    private int heajth;
    private int damace;
    private String name;

    public GameEntity(int heajth, int damace, String name) {
        this.heajth = heajth;
        this.damace = damace;
        this.name = name;

    }

    public int getHeajth() {
        return heajth;
    }

    public void setHeajth(int heajth) {
        if (heajth < 0) {
           this.heajth = 0;

        }else {
            this.heajth = heajth;
        }
    }

    public int getDamace() {
        return damace;
    }

    public void setDamace(int damace) {
        this.damace = damace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
