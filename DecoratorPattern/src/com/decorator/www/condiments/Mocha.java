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
        return .40 + beverage.cost();
    }



}
