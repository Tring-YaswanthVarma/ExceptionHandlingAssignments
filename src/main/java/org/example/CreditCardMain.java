package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

class CreditCardMain {
    public static void main(String[] args)  {
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
