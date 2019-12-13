package data;

import java.util.ArrayList;

public class Issue {

    private int yearPublished, volumeNumber, issueNumber, id;
    private ArrayList<Article> articles;
    private Journal journal;
    private static int currentID = 0;

    public Issue(int yearPublished, int volumeNumber, int issueNumber){
        this.yearPublished = yearPublished;
        this.volumeNumber = volumeNumber;
        this.issueNumber = issueNumber;
    }

    public Issue(int yearPublished, int volumeNumber, int issueNumber, ArrayList<Article> articles){
        this.yearPublished = yearPublished;
        this.volumeNumber = volumeNumber;
        this.issueNumber = issueNumber;
        this.articles = articles;
    }

    public String toString(){
        return "Issue Volume " + issueNumber + ", Volume " + volumeNumber + ". (" + yearPublished + ")";
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(int volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void addArticles(ArrayList<Article> articles, Article articleToAdd) {
        this.articles.add(articleToAdd);
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournalReference(Journal journal) {
        this.journal = journal;
    }

}
