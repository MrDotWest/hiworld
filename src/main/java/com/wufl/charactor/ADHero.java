package com.wufl.charactor;

public class ADHero extends Hero implements AD {
    public void attack() {
        System.out.println(name + " 进行了一次攻击，但是不确定打中了谁");
    }
    public void attack(Hero... heroes) {
        for (Hero h: heroes) {
            System.out.println(name + " 攻击了" + h.name);
        }
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
