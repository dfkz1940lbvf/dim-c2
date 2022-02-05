package com.company;

public class Main {

    public static void main(String[] args) {
        byte a = 101;
        System.out.println(a);
        short b = 31001;
        System.out.println(b);
        int c = 211378;
        System.out.println(c);
        long d = 8900001L;
        System.out.println(d);
        double e = 3.9;
        System.out.println(e);
        float f = (float) 1.99;
        System.out.println(f);
        System.out.println("Задача 2");
        float boxer1 = (float) 78.2;
        System.out.println("вес первого боксера составляет " + boxer1 + "кг");
        float boxer2 = (float) 87.2;
        System.out.println("вес второго боксера составляет " + boxer2 + "кг");
        float boxer3 = boxer1 + boxer2;
        System.out.println("Общий вес боксеров составляет " + boxer3 + "кг");
        boxer2 = boxer2 - boxer1;
        System.out.println("Второй боксер тяжелее первого на " + boxer2 +"кг");

        System.out.println("Задача 3");
        float bananas = 80;
        float milk = 105;
        float icecream = 100;
        float egg = 70;
        bananas = bananas * 5;
        milk = milk * 2;
        icecream = icecream * 2;
        egg = egg * 4;
        float breakfast = bananas + milk + icecream + egg;
        System.out.println("Общий вес завтрака составляет " + breakfast + "граммов");
        breakfast = breakfast/1000;
        System.out.println("Или " + breakfast + "кг");

        System.out.println("Задача 4");
        int weight = 7;
        weight = 7*1000;
        int weight1 = 250;
        int weight2 = 500;
        weight = weight/weight1;
        int weight3 = weight2/weight1;
        System.out.println(" Спортсмен затратит " + weight +" дней, если будет сбрасывать по 250 гр. в день");
        weight = weight/weight3;
        System.out.println("Спортсмен затратит " + weight + " дней, при сбрасывании по 500 гр в день");

        System.out.println("Задача 5");
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int masha1 = masha/10;
        int denis1 = denis/10;
        int kris1 = kris/10;
        masha = masha + masha1;
        denis = denis + denis1;
        kris = kris + kris1;


        System.out.println("Маша теперь получает " + masha +" руб."
        + "Ее годовой доход вырос на " + masha1*12 +" руб.");
        System.out.println( "Денис теперь получает " + denis + " руб. Его годовой доход вырос на " + denis1*12 +" руб."
        );
        System.out.println(" Кристина теперь получает " + kris +" руб. Ее годовой доход вырос на " + kris1*12 +" руб.");






	// write your code here
    }
}
