package data;

public class Article {

    private String title, author;
    private Issue issue;
    private int id;
    private static int currentID = 0;

    public Article(){
        //boilerplate for generation from the console.
    }

    public Article(String title, String author){
        //if there's no issue to assign to
        this.title = title;
        this.author = author;
        this.id = currentID++;
    }

    public Article(String title, String author, Issue issue){
        this.title = title;
        this.author = author;
        this.issue = issue;
        this.id = currentID++;
    }

    public String toString(){
        return "\"" + title + "\": " + author + ".";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssueReference(Issue issue) {
        this.issue = issue;
    }

    public int getId() {
        return id;
    }
}
