package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

class BasicPointMain {
    public static void main(String[] args) {
        double x;
        double y;
        String check;
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("com.api.jar");
        try {
            logger.info("Enter coordinates for first point.");
            logger.info("Enter x : ");
            x = sc.nextDouble();
            logger.info("Enter y : ");
            y = sc.nextDouble();
            BasicPointException bp1 = new BasicPointException(x, y);
            logger.info("Enter coordinates for second point");
            logger.info("Enter x : ");
            x = sc.nextDouble();
            logger.info("Enter y : ");
            y = sc.nextDouble();
            BasicPointException bp2 = new BasicPointException(x, y);
            logger.info("Before cloning");
            check = "Objects bp1 and bp2 are equal : " + bp1.checkEqual(bp2);
            logger.info(check);
            logger.info("After cloning");
            bp2 = (BasicPointException) bp1.clone();
            String s = "Objects bp1 and bp2 are equal : " + bp1.checkEqual(bp2);
            logger.info(s);
        } catch (InputMismatchException e) {
            logger.info("Something went wrong while giving input");
        } catch (Exception e) {
            String s = "Something went wrong " + e;
            logger.info(s);
        }
    }
}
