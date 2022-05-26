package com.solvd.shop.articles;
import com.solvd.shop.enums.CardType;
import com.solvd.shop.exceptions.InvalidCardException;
import com.solvd.shop.interfaces.Payment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Books extends Products implements Payment {

    private static final Logger LOG = LogManager.getLogger("");

    List <String> list = new ArrayList<>();

    public void setList(List<String> list) {
        this.list = list;
        list.add("Stephen King");
        list.add("Edgar Allan Poe");
        list.add("Lewis Carrol");

    }

    private String book;


    public Books(String name, double costUnit, int cantStock,
                  boolean available, String Author) {
        super(name, costUnit, cantStock, available);
        this.book = book;
    }
    @Override
    public String toString() {
        return "BOOK ARTICLES\n" + super.toString() + "Book: "
                + this.book;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }


    @Override
    public void pay() {
        Payment.super.pay();
    }

    @Override
    public String validateCard(String ccNumber, Date expDate, int cvcCode, Enum<CardType> card) throws InvalidCardException {
        return null;
    }
}


