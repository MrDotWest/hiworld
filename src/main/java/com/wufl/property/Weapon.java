package com.wufl.property;

public class Weapon extends Item {
    public int damage;

    public void effect() {
        System.out.println("武器使用后，可以造成伤害");
    }
}
