package data;

import java.util.ArrayList;
import java.util.HashMap;

public class Journal {

    private String title;
    private ArrayList<Issue> issues;
    private int id;
    private static int currentID = 0;

    public Journal(String title, ArrayList<Issue> issues) {
        this.title = title;
        this.issues = issues;
        this.id = currentID++;
    }

    public int getId(){
        return id;
    }

    public String getMostPublishedAuthor(){

        HashMap<String, Integer> results = new HashMap<>();

        if(this.getIssues().size() >0) {
            for (Issue i : this.getIssues()) {
                if(i.getArticles().size() > 0) {
                    for (Article a : i.getArticles()) {
                        String temp = a.getAuthor();

                        if (results.get(temp) != null) {
                            int num = results.get(temp);
                            results.put(temp, num + 1);
                        } else {
                            results.put(temp, 1);
                        }
                    }
                }
            }
        }
        //TODO - Simplify. Impossible to read lol
        return results.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }

    public String getTitle() {
        return title;
    }

    public String viewArticles(int fromYear){
        String result = "";

        for(Issue i: this.getIssues()) {
            if(i.getArticles().size() > 0) {
                if(i.getYearPublished() == fromYear) {
                    for (Article a : i.getArticles()) {
                        result += a.toString();
                    }
                }
            }
        }
        return result;
    }

    public ArrayList<Issue> getIssues(){
        return issues;
    }

    public static ArrayList<Journal> getSampleJournals(){

        Article a1 = new Article("A1 - STEAK SAUCE", "Jim Guy");
        Article a2 = new Article("Definitely an article", "Author McWritington III");
        Article a3 = new Article("Chet the Chef shows us their ways", "Bob Vance, Vance Refrigeration");
        Article a4 = new Article("Meeting your first cat", "Author McWritington III");
        Article a5 = new Article("Perfecting Grilled Cheese", "Samuel Sam");
        Article a6 = new Article("Is there an issue?", "Tom Hanks");
        Article a7 = new Article("Never Stop Running", "Tom Cruise");
        Article a8 = new Article("ITS FUCKING RAW", "Gordon Ramsay");
        Article a9 = new Article("Plagiarize your plagiarism", "<Paste Author Here>");
        Article a10 = new Article("I like turtles", "Guy From The Circus");


        //TODO: refactor into function.
        var articles1 = new ArrayList<Article>();
        articles1.add(a1);
        articles1.add(a2);

        var articles2 = new ArrayList<Article>();
        articles2.add(a3);
        articles2.add(a4);

        var articles3 = new ArrayList<Article>();
        articles3.add(a5);

        var articles4 = new ArrayList<Article>();
        articles4.add(a6);
        articles4.add(a7);

        var articles5 = new ArrayList<Article>();
        articles5.add(a8);
        articles5.add(a9);
        articles5.add(a10);

        Issue i1 = new Issue(2012, 1, 1, articles1);
        Issue i2 = new Issue(2012, 1,2, articles2);
        Issue i3 = new Issue(2018, 1, 1, articles3);
        Issue i4 = new Issue(2018,2,1, articles4);
        Issue i5 = new Issue(2018,2,2, articles5);

        ArrayList<Issue> list1 = new ArrayList<>();
        list1.add(i1);
        list1.add(i2);

        ArrayList<Issue> list2 = new ArrayList<>();
        list2.add(i3);
        list2.add(i4);
        list2.add(i5);

        Journal j1 = new Journal("Funkytown", list1);
        Journal j2 = new Journal("Very Academic Stuff", list2);

        ArrayList<Journal> journals = new ArrayList<>();
        journals.add(j1);
        journals.add(j2);

        return journals;
    }
}
