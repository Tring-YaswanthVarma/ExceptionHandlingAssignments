package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

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


class CreditCardMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("com.api.jar");
        try {
            String name;
            int cardNumber;
            String expDate;
            logger.info("Enter card details for first person");
            logger.info("Enter name : ");
            name = sc.nextLine();
            logger.info("Enter card number : ");
            cardNumber = sc.nextInt();
            sc.nextLine();
            logger.info("Enter expiry date : ");
            expDate = sc.nextLine();
            CreditCardException c1 = new CreditCardException(name, cardNumber, expDate);
            logger.info("Enter card details of second person");
            logger.info("Enter name :");
            name = sc.nextLine();
            logger.info("Enter card number : ");
            cardNumber = sc.nextInt();
            sc.nextLine();
            logger.info("Enter expiry date : ");
            expDate = sc.nextLine();
            CreditCardException c2 = new CreditCardException(name, cardNumber, expDate);
            logger.info("Before cloning");
            String check = "Objects c1 and c2 are both equal : " + c1.equals(c2);
            logger.info(check);
            c2 = c1.clone();
            logger.info("After Cloning");
            check = "Objects c1 and c2 are both equal : " + c1.equals(c2);
            logger.info(check);
        } catch (InputMismatchException e) {
            logger.info("Something went wrong while giving input");
        } catch (Exception e) {
            String s = "Something went wrong " + e;
            logger.info(s);
        }
    }
}