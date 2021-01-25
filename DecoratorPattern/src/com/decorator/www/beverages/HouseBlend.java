package com.decorator.www.beverages;

import com.decorator.www.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }


    @Override
    public double cost() {
        double cost = 2.50 + super.cost();
        if (super.getSize() == Size.TALL){
            cost += .10;
        }else if(super.getSize() == Size.GRANDE){
            cost += .15;
        }else if(super.getSize() == Size.VENTI){
            cost += .20;
        }
        return cost;
    }
}
