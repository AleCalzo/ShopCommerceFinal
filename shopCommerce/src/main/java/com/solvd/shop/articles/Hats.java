package com.solvd.shop.articles;

import com.solvd.shop.interfaces.Discount;
import com.solvd.shop.interfaces.Regards;

public class Hats extends Products implements Regards {

    private String hats;

    public Hats() {
    }

    public Hats(String name, double costUnit, int cantStock,
                  boolean available, String designer) {
        super(name, costUnit, cantStock, available);
        this.hats =hats;
    }

    @Override
    public String toString() {
        return "HATS ARTICLES\n" + super.toString() + "Hats: "
                + this.hats;
    }

    public String getHats() {
        return hats;
    }

    public void setHats(String hats) {
        this.hats = hats;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}

