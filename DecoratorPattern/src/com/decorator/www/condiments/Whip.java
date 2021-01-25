package com.decorator.www.condiments;

import com.decorator.www.Beverage;
import com.decorator.www.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {

        return .20 + beverage.cost();
    }
}
