package com.wufl.charactor;

import com.wufl.property.Item;

public class Hero {

    public String name;
    public float hp;
    public float armor;
    public int moveSpeed;

    public  Hero() {

    }

    public Hero(String heroname) {
        name = heroname;
    }

    public Hero(String heroname, float herohp) {
        name = heroname;
        hp = herohp;
    }

    public  Hero(String heroname, float herohp, float heroarmor) {
        name = heroname;
        hp = herohp;
        armor = heroarmor;
    }

    public  Hero(String heroname, float herohp, float heroarmor, int heromoveSpeed) {
        name = heroname;
        hp = herohp;
        armor = heroarmor;
        moveSpeed = heromoveSpeed;
    }

    public void keng(){
        System.out.println("坑队友！");
    }

    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址" + this);
    }

    public void useItem(Item i){
        i.effect();
    }

    class BattleScore {
        int kill;
        int die;
        int assit;

        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神");
            else
                System.out.println(name + "尚未超神");
        }
    }
}
