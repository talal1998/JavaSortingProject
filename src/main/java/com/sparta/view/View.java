package com.sparta.view;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class View {
    private int listChoice = 0;
    private int sortChoice = 0;
    private boolean listChoiceValid = true;
    private boolean sortChoiceValid = true;
    private Scanner scanner = new Scanner(System.in);
    private static Logger logger = LogManager.getLogger("Java Sorting Application");


    public void userInput() {
        while(listChoiceValid) {
            try {
                System.out.println("Type 1 to generate a random Array or 2 to generate a random ArrayList: ");
                setListChoice(scanner.nextInt());
                if (getListChoice() > 0 && getListChoice() < 3) {
                    listChoiceValid = false;
                } else {
                    logger.warn("User entered a value lower than 0 or greater than 3.");
                    System.out.println("Invalid input. Please try again.");
                    listChoiceValid = true;
                }
            } catch (InputMismatchException e) {
                logger.warn("User entered non-integer input causing error. ", e);
                System.out.println("Invalid input. Please try again.");
                scanner.next();
            }
        }

        while(sortChoiceValid) {
            try {
                System.out.println("Type 1 for BubbleSort, 2 for QuickSort or 3 for Binary Tree Sort: ");
                setSortChoice(scanner.nextInt());
                if (getSortChoice() > 0 && getSortChoice() < 4) {
                    sortChoiceValid = false;
                } else {
                    logger.warn("User entered a value lower than 0 or greater than 4.");
                    System.out.println("Invalid input. Please try again.");
                    sortChoiceValid = true;
                }
            } catch (InputMismatchException e) {
                logger.warn("User entered non-integer input causing error. ", e);
                System.out.println("Invalid input. Please try again.");
                scanner.next();
            }
        }
    }

    public int getListChoice() {
        return listChoice;
    }

    public void setListChoice(int listChoice) {
        this.listChoice = listChoice;
    }

    public int getSortChoice() {
        return sortChoice;
    }

    public void setSortChoice(int sortChoice) {
        this.sortChoice = sortChoice;
    }
}
