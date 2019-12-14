package data;

import java.util.ArrayList;

public class Issue {

    private int yearPublished, volumeNumber, issueNumber;
    private ArrayList<Article> articles;

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

    public int getVolumeNumber() {
        return volumeNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void addArticle(Article articleToAdd){this.articles.add(articleToAdd);}

}
