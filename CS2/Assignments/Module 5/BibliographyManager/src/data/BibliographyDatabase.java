package data;

import java.util.ArrayList;

public class BibliographyDatabase {

    private ArrayList<Journal> database;

    public BibliographyDatabase(){
        database = Journal.getSampleJournals();
    }

    public void viewArticlesFromYear(int number){
        String result = "Articles from the year " + number + ":\n";

        for(Journal j : database){
               result += j.viewArticles(number);
        }

        if(result.equals("Articles from the year " + number + ":\n")){
            result += "No results found.\n";
        }

        System.out.println(result);
    }

    public void mostPublishedAuthor(){
        for(Journal j : database){
            System.out.println("Most published author(s) in journal \"" +j.getTitle() +"\": \n" + j.getMostPublishedAuthor());
        }
    }

    public int getAvailableJournals(){
        return database.size() - 1;
    }

    // ----- Article Mutations -----
    public void addArticle(int journalNum, int issueNum, String title, String author){
        if(database.get(journalNum) != null && database.get(journalNum).getIssues().get(issueNum) != null) {
            database.get(journalNum).getIssues().get(issueNum).addArticle(new Article(title, author));
            System.out.println("Article successfully added.");
        } else {
            System.out.println("Article add unsuccessful.");
            //should never hit here - I default to zero for inputs if user messes around.
        }
    }

    public boolean removeArticle(Article articleToRemove){

        boolean success = false; //allow to remove duplicates

        for(Journal j : database){
            for(Issue i : j.getIssues()){
                if(i.getArticles().contains(articleToRemove)){
                    success = true;
                }
            }
        }
        if(success){
            System.out.println("Article " + articleToRemove.getTitle() + " has been successfully removed from the database.");
        } else {
            System.out.println("Article doesn't exist in the database - no action taken.");
        }
        return success;
    }

    // ----- Issue Functions -----

    public void addIssue(Journal currentJournal, Issue issueToAdd){
        if(database.contains(currentJournal)){
            Journal j = database.get(currentJournal.getId());
            j.getIssues().add(issueToAdd);
            System.out.println("Issue successfully added");
        } else {
            System.out.println("Invalid journal specified. Please try again.");
        }
    }

    public boolean removeIssue(Issue issue){
        boolean success = false; // in case the exact issue exists more than once

        for(Journal j : database){
            if(j.getIssues().contains(issue)){
                j.getIssues().remove(issue);
                System.out.println("Issue successfully removed.");
                success = true;
            }
        }

        return success;
    }

    public int getAvailableIssues(int id){
        if(database.get(id) != null){
            return database.get(id).getIssues().size() - 1;
        } else {
            return 0;
        }
    }

    // ----- Journal Mutations -----

    public void addJournal(Journal journalToAdd){
        database.add(journalToAdd);
        System.out.println("Journal successfully added.");
    }

    public void addListOfJournals(ArrayList<Journal> journals){
        database.addAll(journals);
        System.out.println("Journals successfully added.");
    }

    public boolean removeJournal(Journal journalToRemove){

        if(database.contains(journalToRemove)){
            database.remove(journalToRemove);
            System.out.println("Journal successfully removed.");
            return true;
        }

        System.out.println("Journal removal unsuccessful - doesn't exist.");
        return false;
    }
}
