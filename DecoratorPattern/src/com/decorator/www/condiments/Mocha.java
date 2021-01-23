package com.decorator.www.condiments;

import com.decorator.www.Beverage;
import com.decorator.www.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL){
            cost += .10;
        }else if(beverage.getSize() == Size.GRANDE){
            cost += .15;
        }else if(beverage.getSize() == Size.VENTI){
            cost += .20;
        }

        return cost;
    }



}