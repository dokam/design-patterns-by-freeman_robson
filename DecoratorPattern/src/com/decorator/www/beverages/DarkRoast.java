package com.decorator.www.beverages;

import com.decorator.www.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Most Excellent Dark Roast";
    }

    @Override
    public double cost() {
        double cost = 3.00 + super.cost();
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
