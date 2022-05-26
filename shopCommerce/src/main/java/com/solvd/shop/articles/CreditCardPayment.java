package com.solvd.shop.articles;

import java.util.Date;

import com.solvd.shop.enums.CardType;
import com.solvd.shop.exceptions.InvalidCardException;
import com.solvd.shop.interfaces.Payment;
import org.apache.logging.log4j.*;

public class CreditCardPayment implements Payment {

    private CardType ccNumber;;
    private Date expDate;
    private int cvcCode;

    private static final Logger LOGGER = LogManager.getLogger(CreditCardPayment.class);

    public CreditCardPayment(CardType ccNumber, Date expDate, int cvcCode) {
        super();
        this.ccNumber = ccNumber;
        this.expDate = expDate;
        this.cvcCode = cvcCode;
    }

    public CreditCardPayment (){}

    public String validateCard(String ccNumber, Date expDate, int cvcCode, Enum<CardType> card)
            throws InvalidCardException {
        LOGGER.info("validating new card info: " + ccNumber + " " + expDate + " " + cvcCode + " " + card);
        if (ccNumber.chars().count() != 16)
            throw new InvalidCardException("Card is invalid");

        else
            return "card is valid";

    }

    public CardType getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(CardType ccNumber) {
        this.ccNumber = ccNumber;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public int getCvcCode() {
        return cvcCode;
    }

    public void setCvcCode(int cvcCode) {
        this.cvcCode = cvcCode;
    }

}
