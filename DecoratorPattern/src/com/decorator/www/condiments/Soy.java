package com.decorator.www.condiments;

import com.decorator.www.Beverage;
import com.decorator.www.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
