package com.solvd.shop.articles;
import com.solvd.shop.interfaces.Discount;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VideoGame extends Products implements Discount {
    private static final Logger LOG = LogManager.getLogger("");
    private String type;
    public String giveDiscount (String  discount){
       return  "you have a 10% discount"+discount;

    }

    public VideoGame() {
    }
    public VideoGame(String name, double costUnit, int cantStock,
                      boolean available, String type) {
        super(name, costUnit, cantStock, available);
        this.type = type;
    }

    @Override
    public String toString() {
        return "GAME ARTICLE\n" + super.toString() + "Type: "
                + this.type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }

}

