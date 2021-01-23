package com.decorator.www.beverages;

import com.decorator.www.Beverage;

public class Decaf extends Beverage {
    @Override
    public double cost(){
        return super.cost() + .40;
    }
}
