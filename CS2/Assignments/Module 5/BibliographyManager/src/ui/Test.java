package ui;

import java.util.Scanner;

import data.BibliographyDatabase;

public class Test {

    private BibliographyDatabase database;

    Test(BibliographyDatabase database) {
        this.database = database;
    }

    public static void run(BibliographyDatabase journals) {
        System.out.println("Welcome to the Bibliography Database!\n");

        Scanner scan = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.println("\n" +
                    "You may perform the following operations:\n" +
                    "  1) Find articles from a given year\n" +
                    "  2) Add an article to an issue\n" +
                    "  3) Find the most-published author\n" +
                    "  4) Exit\n" +
                    "Please enter your choice (1, 2, or 3): ");

            inputNumber = getInput();
            switch (inputNumber) {
                case 1:
                    System.out.println("What year would you like to view?");
                    inputNumber = getInput();
                    journals.viewArticlesFromYear(inputNumber);
                    break;
                case 2:
                    int journalSize = journals.getAvailableJournals();
                    System.out.println("Which journal would you like to add to?\n" +
                            "Choose a journal ID between 0 and " + journalSize +
                            ":\n");

                    inputNumber = getInput();

                    int journalNum;

                    if (inputNumber < 0 && inputNumber > journalSize) {
                        System.out.println("Chose invalid number. Selecting journal 0 by default.");
                        journalNum = 0; //no fucking around here
                    } else {
                        journalNum = inputNumber;
                    }

                    System.out.println("What issue would you like to place the article in?\n" +
                            "You can choose a number from 0 and " + journals.getAvailableIssues(journalNum));

                    int issueNum = getInput();

                    System.out.println("Title of Article?");

                    String articleTitle = scan.nextLine();

                    System.out.println("Author?");

                    String articleAuthor = scan.nextLine();

                    journals.addArticle(journalNum, issueNum, articleTitle, articleAuthor);

                    break;
                case 3:
                    //Most published author
                    journals.mostPublishedAuthor();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please enter one of the specified values.");
                    break;

            }
        }
        while (inputNumber != 4);

        //user has left the loop.
        System.out.println("Thanks for using the Bibliography Database. Goodbye!");
    }

    public static int getInput(){

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            System.out.println("Please enter a valid response.");
            scan.next();
        }

        return scan.nextInt();
    }

    public static int getInput(String input){

        //currently only have year. will build switch if necessary.

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            System.out.println("Please enter a valid response.");
            scan.next();
        }

        return scan.nextInt();
    }

    public static void main(String[] args) {

        BibliographyDatabase journals = new BibliographyDatabase();
        run(journals);

    }
}
