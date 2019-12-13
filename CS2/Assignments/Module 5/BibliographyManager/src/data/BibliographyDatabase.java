package data;

import java.util.HashMap;

//Create a class called data.BibliographyDatabase. Users of the class should be able to add or remove a particular article,
//issue, or journal, and to add a list of journals.

public class BibliographyDatabase {

    HashMap<Integer, Journal> database = new HashMap<>();

    private HashMap<Integer, Journal> addArticle(HashMap<Integer, Journal>currentDB, Journal journal, Issue issue, Article articleToAdd){

        currentDB.put(journal.getId(), journal.getIssue(issue).addArticle(articleToAdd));
        return currentDB;
    }

    private boolean removeArticle(Article articleToRemove){

        if(database.get(articleToRemove.getIssue().getJournal().getId()) != null){
            database.remove(articleToRemove.getIssue().getJournal().getId());
            System.out.println("Article " + articleToRemove.getTitle() + " has been successfully removed from the database.");
            return true;
        }

        System.out.println("Article doesn't exist in the database - no action taken.");
        return false;
    }



    private boolean removeJournal(Journal journalToRemove){



        return false;
    }
}
