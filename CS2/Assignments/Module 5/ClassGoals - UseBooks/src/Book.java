public class Book {

    private int id;
    static private int currentID = 0;
    private String title;
    private String author;
    private long isbn;
//    private int fromShelf;

    public Book(String title, String author, long isbn){
        this.id = currentID++;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString(){
        return "\"" + title + "\": a book by " + author + ". ISBN: " + isbn + " - ID: " + id;
    }

}

/*
 no set methods whatsoever. If data needs to change in a class, implement a method that represents a higher level
 action that just happens to change data within the class. You will have to pass references to other objects into
 some methods to accomplish this.
 */
