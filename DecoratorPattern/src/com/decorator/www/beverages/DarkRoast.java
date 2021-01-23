package com.decorator.www.beverages;

import com.decorator.www.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Most Excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 2.3 + super.cost();
    }
}
