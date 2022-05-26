package com.solvd.shop.articles;

import com.solvd.shop.enums.SizeTshirts;
import com.solvd.shop.interfaces.Cupon;
import com.solvd.shop.interfaces.Size;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Shirt extends Products implements Cupon, Size{
    private static final Logger LOG = LogManager.getLogger("");
    private String shirt;
    private SizeTshirts sizeTshirts;
    private final Scanner scanner = new Scanner(System.in);

    String shirtSize1= "Large";
    String shirtSize2= "Small";
    String shirtSize3= "Medium";
    String userShirt;
    Size s= new Size() {
        @Override
        public void tellSize(String sizeType) {

        }
    };
    public Shirt() {
    do {
        LOG.debug("What size are you looking for?");
        s.tellSize("");
    }while (!userShirt.equals(shirtSize2));
    LOG.debug("sorry there is no more small size");
    }



    public Shirt(String name, double costUnit, int cantStock,
                 boolean available, String heroes) {
        super(name, costUnit, cantStock, available);

        this.shirt =shirt;
    }

    @Override
    public String toString() {
        return "SHIRT ARTICLES\n" + super.toString() + "Shirt: "
                + this.shirt;
    }

    public String getShirt() {
        return shirt;
    }

    public void setShirt(String mask) {
        this.shirt = shirt;
    }

    <cupon> int applyCupon (){
        return 0;
    }


    @Override
    public String sayHello(String greeting) {
        return null;
    }

    @Override
    public void tellSize(String  sizeType) {
        LOG.debug("You choose size" + userShirt);

}

    @Override
    public void cupon() {
        LOG.debug("You have a 10% discount!!");
    }
}
