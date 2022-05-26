package com.solvd.shop.articles;

import com.solvd.shop.interfaces.Cupon;
import com.solvd.shop.interfaces.Regards;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Mask extends Products implements Regards, Cupon {

    private static final Logger LOG = LogManager.getLogger("");

    private String mask;
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    Cupon cup = new Cupon() {
        @Override
        public void cupon() {

        }
    };

    public Mask() {

        do {
            LOG.debug("Would you like a cupon? for yes press 1, for no 2" + answer);
        }while (answer != 1);
            cup.cupon();
        }

    public Mask(String name, double costUnit, int cantStock,
                boolean available, String creator) {
        super(name, costUnit, cantStock, available);

        this.mask =mask;
    }


    @Override
    public String toString() {
        return "MASK ARTICLES\n" + super.toString() + "Mask: "
                + this.mask;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }

    @Override
    public void cupon() {

    }
}



