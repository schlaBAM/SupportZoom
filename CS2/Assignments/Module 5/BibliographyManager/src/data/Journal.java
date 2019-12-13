package data;

import java.util.ArrayList;

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

    public static ArrayList<Journal> getSampleJournals(){

        Issue i1 = new Issue(2012, 1, 1);
        Issue i2 = new Issue(2012, 1,2);
        Issue i3 = new Issue(2018, 1, 1);
        Issue i4 = new Issue(2018,2,1);
        Issue i5 = new Issue(2018,2,2);

        Article a1 = new Article("A1 - STEAK SAUCE", "Jim Guy", i1);
        Article a2 = new Article("Definitely an article", "Author McWritington III", i1);
        Article a3 = new Article("Chet the Chef shows us their ways", "Bob Vance, Vance Refrigeration", i2);
        Article a4 = new Article("Meeting your first cat", "Author McWritington III", i2);
        Article a5 = new Article("Perfecting Grilled Cheese", "Samuel Sam");
        Article a6 = new Article("Is there an issue?", "Tom Hanks", i4);
        Article a7 = new Article("Never Stop Running", "Tom Cruise", i4);
        Article a8 = new Article("ITS FUCKING RAW", "Gordon Ramsay", i5);
        Article a9 = new Article("Plagiarize your plagiarism", "<Paste Author Here>");

        a5.setIssueReference(i3);
        a9.setIssueReference(i5);

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
