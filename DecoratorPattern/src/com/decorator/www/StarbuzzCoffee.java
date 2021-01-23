package com.decorator.www;

import com.decorator.www.beverages.DarkRoast;
import com.decorator.www.beverages.Espresso;
import com.decorator.www.beverages.HouseBlend;
import com.decorator.www.condiments.Mocha;
import com.decorator.www.condiments.Soy;
import com.decorator.www.condiments.Whip;

import java.text.DecimalFormat;

import static com.decorator.www.Beverage.Size.TALL;


public class StarbuzzCoffee {

    public static void main(String[] args){
        Beverage beverage = new Espresso();
        beverage.setMilk();
        beverage.setWhip();
        beverage.setSize(TALL);
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(beverage.getDescription() + " $" + f.format(beverage.cost()));

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + " $" + f.format(beverage1.cost()));

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + f.format(beverage2.cost()));


    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
