package com.wufl;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.wufl.charactor.*;
import com.wufl.property.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hi World!" );
//        classConvert();
//        forTest();
//        arraysTest();
//        ADHeroTest();
//        giantDragonTest();
//        seasonTest();
//        instanceofTest();
//        overrideTest();
//        numberTest();
//        stringTest();
        dateTest();
    }

    private static void varPart() {
        int yeat = 1949;

        byte b = 1;
        short s = 200;
        int i = 300;
        long l = 400;

//        byte b2 = 200;

        char c = 'a';
//        char c1 = 'as';

//        float f = 54.321;
        float f2 = 54.321f;

        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 1;

        String str = "Hello Java";

        long val = 26L;
        int decVal = 26;
        int hexVal = 0x1a;
        int oxVal = 032;
        int binVal = 0b11010;

        float f1 = 123.4f;
        double d1 =123.4;
        double d2 = 1.234e2;

        String name = "盖伦";
        char a = 'c';

        char tab = '\t';
        char carriageReturn = '\r';
        char newLine = '\n';
        char doubleQuote = '\"';
        char singleQuote = '\'';
        char backslash = '\\';
    }

    private static void classConvert(){
        char c = 'A';
        short s = 80;

        c = (char)s;
//        s=c;

        long l = 50;
        int i = 50;
        l =i;
//        i=l;

        byte b = 5;
        int i1 = 10;
        int i2 = 300;
        b = (byte)i1;
        System.out.println(b);
        b = (byte) i2;
        System.out.println(b);

        System.out.println(Integer.toBinaryString(i2));
    }

    private static void nameRule() {
        int a= 5;
        int a_12 = 5;
        int $a43= 5;
        int a434= 5;

//        int 34a= 5;

        int class5 = 5;

    }

    private static  void finalTest() {
        final int i =5;
//        i = 10;

        final  int i2;
        i2 = 10;
//        i2 =11;
    }

    private static void arrayTest() {
        int[] a;
        a = new int[]{1,2,3,4,5};

        int[] b = new int[5];
    }

    private static void forTest() {
        int values[] = new int[]{1,2,3,4,5,6,7};
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.println(each);
        }

        for (int each: values) {
            System.out.println(each);
        }
    }

    private static void arraysTest() {
        int a[] =new int[] {18,62,68,82,65,9};
        int[] b = Arrays.copyOfRange(a, 0, 3);
        for (int i =0; i< b.length; i++) {
            System.out.print(b[i] + " ");
        }

        String content = Arrays.toString(a);
        System.out.println(content);
    }

    private static void heroTest(){
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 300;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        Hero h1;
        Hero h2;
        h1 = garen;
        h2 = h1;
        System.out.println(h2.equals(garen));
    }

    private static void weaponTest() {
        Weapon infinityEdge = new Weapon();
        infinityEdge.damage = 65;
        infinityEdge.name = "无尽之刃";
        infinityEdge.price = 3600;
    }

    private static void ArmorTest() {
        Armor a1 = new Armor();
        a1.name = "布甲";
        a1.price = 300;
        a1.ac = 15;

        Armor a2 = new Armor();
        a2.name = "锁子甲";
        a2.price = 500;
        a2.ac = 40;
    }

    private static void ADHeroTest(){
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";
        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        bh.attack(h1);
        bh.attack(h1, h2);

        bh.showAddressInMemory();
        System.out.println("打印对象看到的虚拟地址："+bh);
        h1.showAddressInMemory();
        System.out.println("打印对象看到的虚拟地址："+h1);
        h2.showAddressInMemory();
        System.out.println("打印对象看到的虚拟地址："+h2);
    }

    private static void giantDragonTest(){
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();

        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }

    private static void seasonTest(){
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }

    private static void instanceofTest() {
        ADHero ad = new ADHero();
        APHero ap = new APHero();

        Hero h1 = ad;
        Hero h2 = ap;

        System.out.println(h1 instanceof ADHero);
        System.out.println(h2 instanceof APHero);
        System.out.println(h1 instanceof Hero);
    }

    private static void overrideTest(){
        Item i = new Item();
        i.effect();

        Item w = new Weapon();
        w.effect();
    }

    private static void numberTest() {
        int i = 5;
        Integer it = new Integer(i);
        System.out.println(it instanceof Number);

        int i2 = it.intValue();
        Integer it2 = i2;
        System.out.println(it2);

        String str = String.valueOf(i);

        String str2 = it.toString();

        String str3 = "999";
        int i3 = Integer.parseInt(str3);

    }

    private  static void charTest(){
        char c1 = 'a';
        Character c = c1;
        c1 = c;
    }

    private static void stringTest() {
        String garen = "盖伦";
        String teemo = new String("提莫");
        char[] cs = new char[]{'崔','斯','特'};

        String hero = new String(cs);
        String hero3 = garen + teemo;
        System.out.println(hero);
        System.out.println(hero3);

        String str1 = "the light";
        String str2 = new String(str1);
        String str3 = str1.toUpperCase();
        System.out.println( str1  ==  str2);

        System.out.println(str1.equals(str2));//完全一样返回true

        System.out.println(str1.equals(str3));//大小写不一样，返回false
        System.out.println(str1.equalsIgnoreCase(str3));//忽略大小写的比较，返回true
    }

    private static void dateTest(){
        Date d1 = new Date();
        System.out.println("当前时间：");
        System.out.println(d1);
        System.out.println();

        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);

        System.out.println("当前时间getTime()返回的值是："+d1.getTime());
        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());
        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是:"+zero);


        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d11= new Date();
        String str1 = sdf1.format(d11);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);
    }
}
