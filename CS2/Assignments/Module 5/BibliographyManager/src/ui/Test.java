package ui;

import java.util.Scanner;
import data.BibliographyDatabase;
import data.Journal;

public class Test {

    private BibliographyDatabase database;

    Test(BibliographyDatabase database){this.database = database;}

        public static void run(){
            System.out.println("Welcome to the Bibliography Database!\n");

            int inputNumber;
            Scanner scan = new Scanner(System.in);

            while(inputNumber != 4){

                System.out.println("\n" +
                        "You may perform the following operations:\n" +
                        "  1) Find articles from a given year\n" +
                        "  2) Add an article to an issue\n" +
                        "  3) Find the most-published author\n" +
                        "  4) Exit\n" +
                        "Please enter your choice (1, 2, or 3): ");
                inputNumber = scan.nextInt();
                int choice;


                switch(inputNumber){
                    case 1:
                        System.out.println("What year would you like to view?");
                        choice = scan.nextInt();
                        break;
                    case 2:
                        Article newArticle = new Article();
                        System.out.println("Title?");
                        String title = scan.nextLine();
                        if(title.length() != 0){
                            //newArticle.set
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                    default:
                        break;
                }


                System.out.println("\nWhat would you like to do next?");
            }

            //user has left the loop.
            System.out.println("Thanks for using the Bibliography Database. Goodbye!");
        }

    public static void main(String[] args){

        Test sampleTest = new Test(Journal.getSampleJournals());
        run();

    }
}

/*
In this question, you will make a program that helps format a bibliography. For all your classes, you need to follow
good encapsulation and information hiding design principles, so think carefully about what methods each class should
have and what the access modifiers for attributes and methods should be.

Create a class called data.BibliographyDatabase. Users of the class should be able to add or remove a particular article,
issue, or journal, and to add a list of journals.

Using separated presentation design, design a user interface class that allows users to perform the following operations
 via a text interface (you can use the branching story example as inspiration):

report all Articles (in any issue of any journal) from a given year formatted in the format ("author. title. journal,
volume(issue), year.") -> add an data.Article to a given data.Issue (by specifying the title and author)
find the name of the author with the highest number of Articles

Inside the user interface’s main method, you should create an instance of the UI class, and use getSampleJournals to
initialize a list of Journals before the menu is shown.

---------------------------------------------------
Here is how a run of the program might look:

Welcome to the Bibliography Database!

You may perform the following operations:
  1) Find articles from a given year
  2) Add an article to an issue
  3) Find the most-published author
  4) Exit
Please enter your choice (1, 2, or 3): 1

What year are you interested in? 2010
Here are the articles from 2010:
  Jane Doe. All About Java. data.Journal of Computer Science, 15(2), 2010.
  John Smith. All About C++. data.Journal of Programming, 12(4), 2010.

You may perform the following operations:
  1) Find articles from a given year
  2) Add an article to an issue
  3) Find the most-published author
  4) Exit
Please enter your choice (1, 2, or 3): 2

Here are the available issues:
  1) data.Journal of Computer Science, Volume 15, data.Issue 2
  2) data.Journal of Programming, Volume 12, data.Issue 4
What issue would you like to add to (1 or 2): 1
Please specify the article title: [...]
Please specify the article author: [...]

You may perform the following operations:
  1) Find articles from a given year
  2) Add an article to an issue
  3) Find the most-published author
  4) Exit
Please enter your choice (1, 2, or 3): 3

The most published author is Jane Doe.

You may perform the following operations:
  1) Find articles from a given year
  2) Add an article to an issue
  3) Find the most-published author
  4) Exit
Please enter your choice (1, 2, or 3): 4

Bye!
 */