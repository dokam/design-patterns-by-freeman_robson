package com.decorator.www.beverages;

import com.decorator.www.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }


    @Override
    public double cost() {
        return .89 + super.cost();
    }
}
