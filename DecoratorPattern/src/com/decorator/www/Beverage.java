package com.decorator.www;

import com.decorator.www.condiments.Soy;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};

    Size size = Size.TALL;

    public String description = "Unknown Beverage";

    private boolean milk;

    private boolean soy;

    private boolean mocha;

    private boolean whip;

    private final double MILK_COST = .30;
    private final double SOY_COST = .20;
    private final double MOCHA_COST = .50;
    private final double WHIP_COST = .60;

    void setMilk() {
        this.milk = true;
    }

    void setSoy() {
        this.soy = true;
    }

    void setMocha() {
        this.mocha = true;
    }

    void setWhip() {
        this.whip = true;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public String getDescription(){
        return  description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double cost() {
        double total = 0.0;
        if (isMilk()) {
            total += MILK_COST;
        }
        if (isSoy()) {
            total += SOY_COST;
        }
        if (isMocha()) {
            total += MOCHA_COST;
        }
        if (isWhip()) {
            total += WHIP_COST;
        }
        return total;


    }
}
