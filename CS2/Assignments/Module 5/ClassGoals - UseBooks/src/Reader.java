import java.util.ArrayList;

public class Reader {

    private String name;
    private boolean hasBook;
    private Book currentBook;

    public Reader(String name){
        this.name = name;
        hasBook = false;
    }

    public Reader(String name, Book currentBook){
        this.name = name;

        if(currentBook != null) {
            hasBook = true;
        } else {
            hasBook = false;
        }

        this.currentBook = currentBook;

    }

    public String getName() {
        return name;
    }

    public boolean hasABook() {
        return hasBook;
    }

    public Book getCurrentBook() {
        return currentBook;
    }

    public String toString(){
        if(hasBook){
            return name + " is currently reading \"" + currentBook.getTitle() + "\" by " + currentBook.getAuthor() + ".";
        } else{
            return name + " does not currently have a book.";
        }
    }

    public void attemptToTakeBook(Bookcase library, Book book){
        try {
            System.out.println("Attempting to take \"" + book.getTitle() + "\" for " + name + "...");
            takeBook(library, book);
        } catch (Exception e){
            System.out.println("Caught error: " + e.toString());
            System.out.println("\"" + book.getTitle() + "\" currently not in library. Please have " + name + " try taking another.");
        }
    }

    public boolean takeBook(Bookcase library, Book book){
        if(!this.hasABook()){
            //take book
            currentBook = library.removeBook(book);
            System.out.println(name + " now has \"" + currentBook.getTitle() + "\" in their possession.\n");
            this.hasBook = true;
            return true;
        } else {
            System.out.println(name + " already has a book: \"" + currentBook.getTitle() + "\". Please return before taking another.\n");
            return false;
        }
    }

    public void returnBook(Bookcase library, Book book){

        //try to put it on the first shelf, continue until space is found.
        int shelf = 0;

        while(shelf < library.getNumShelves()){

            if(library.addBook(shelf, book) == true){
                this.hasBook = false;
                System.out.println("\"" + book.getTitle() + "\" returned to shelf " + shelf + ".");
                break;
            } else {
                this.hasBook = true;
            }
            shelf++;
        }
        if(this.hasBook){
            System.out.println("Bookcase is full. You're stuck with that book for life.");
        }
    }

}

/*
This class represents somebody that can take a book off a bookcase to read. A reader can have exactly one book
in their possession at a time. After a reader takes a book, they should have a reference to the book, but the
bookshelf should not. They can later put the book back on the shelf.
 */