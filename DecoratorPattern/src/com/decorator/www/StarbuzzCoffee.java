package com.decorator.www;

import com.decorator.www.beverages.DarkRoast;
import com.decorator.www.beverages.Espresso;
import com.decorator.www.beverages.HouseBlend;
import com.decorator.www.condiments.Mocha;
import com.decorator.www.condiments.Soy;
import com.decorator.www.condiments.Whip;

import java.text.DecimalFormat;

import static com.decorator.www.Beverage.Size.*;


public class StarbuzzCoffee {

    public static void main(String[] args){
        //Size {TALL, GRANDE, VENTI};
        Beverage beverage = new Espresso();//value 2.00
        beverage.setMilk();//value 0.30
        beverage.setWhip();//value 0.60
        beverage.setSize(TALL);//value 0.10
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(beverage.getDescription() + " TALL £" + f.format(beverage.cost()));

        Beverage beverage1 = new Espresso();//value 2.00
        beverage1.setMilk();//value 0.30
        beverage1.setWhip();//value 0.60
        beverage1.setSize(GRANDE);//value 0.15

        System.out.println(beverage.getDescription() + " GRANDE £" + f.format(beverage1.cost()));

        Beverage beverage2 = new Espresso();//value 2.00
        beverage2.setMilk();//value 0.30
        beverage2.setWhip();//value 0.60
        beverage2.setSize(VENTI);//value 0.20

        System.out.println(beverage.getDescription() + " VENTI £" + f.format(beverage2.cost()));

        Beverage beverage3 = new DarkRoast(); //value 3.00
        beverage3.setSize(TALL);//value 0.10
        beverage3 = new Mocha(beverage3);//value 0.40
        beverage3 = new Mocha(beverage3);//value 0.40
        beverage3 = new Whip(beverage3);//value 0.20


        System.out.println(beverage3.getDescription() + " £" + f.format(beverage3.cost()));

        Beverage beverage4 = new HouseBlend();//value 2.50
        beverage4 = new Soy(beverage4);// value 0.10
        beverage4 = new Mocha(beverage4);//value 0.40
        beverage4 = new Whip(beverage4);//value 0.20
        beverage4.setSize(TALL);//value 0.10
        System.out.println(beverage4.getDescription() + " £" + f.format(beverage4.cost()));


    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
