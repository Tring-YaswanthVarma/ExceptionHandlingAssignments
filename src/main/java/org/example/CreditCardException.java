package org.example;

public class CreditCardException implements Cloneable {
    private final String name;
    private final int cardNumber;
    private final String expDate;

    CreditCardException(String name, int cardNumber, String expDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }

    public boolean equals(CreditCardException newCard) {
        return this.cardNumber == newCard.cardNumber;
    }

    @Override
    public CreditCardException clone() throws CloneNotSupportedException {
        return (CreditCardException) super.clone();
    }

}


