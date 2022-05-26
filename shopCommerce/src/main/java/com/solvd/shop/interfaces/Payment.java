package com.solvd.shop.interfaces;

import com.solvd.shop.enums.CardType;
import com.solvd.shop.exceptions.InvalidCardException;

import java.util.Date;

@FunctionalInterface
public interface Payment {

    default void pay() {

    }
    String validateCard(String ccNumber, Date expDate, int cvcCode, Enum<CardType> card) throws InvalidCardException;
}
