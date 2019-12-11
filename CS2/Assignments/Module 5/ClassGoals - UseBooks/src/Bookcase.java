import java.util.HashMap;
import java.util.ArrayList;

/*
A bookcase should be able to hold up to 10 books on each of 5 distinct shelves. A book can be added or removed from
the shelf it is on. If removed, a reference to the book should be provided to whoever was asking to remove it.
 */

public class Bookcase {

    private HashMap <Integer, ArrayList<Book>> bookCase = new HashMap<>();
    private static int NUM_SHELVES = 5;

    public Bookcase(){
        for(int i = 0; i < 5; i++){
            bookCase.put(i, new ArrayList<Book>());
        }
    }

    public boolean addBook(int shelf, Book bookToAdd){
        ArrayList<Book> collection = bookCase.get(shelf);
        if(collection.size() < 10){
            collection.add(bookToAdd);
            bookCase.put(shelf, collection);
            return true;
        } else {
            System.out.println("Not enough space on this shelf.");
            return false;
        }
    }

    public Book removeBook(Book bookToRemove){
        Book wantedBook = null;

        for(int i = 0; i < NUM_SHELVES; i++){
            ArrayList<Book> collection = bookCase.get(i);

            if(collection.contains(bookToRemove)){
                int index = collection.indexOf(bookToRemove);
                wantedBook = collection.get(index);
                collection.remove(bookToRemove);
                bookCase.put(i, collection);
            }
        }

        return wantedBook;
    }

    public String toString(){
        String result = "\n----- Books available on this bookcase: -----\n\n";

        for(int i = 0; i < NUM_SHELVES; i++){
            ArrayList<Book> shelf = bookCase.get(i);
            result += "Shelf " + i + ":\n";

            if(shelf.size() == 0){
                result += "\tNo books currently on this shelf.\n";
            } else {
                for(Book b : shelf){
                    result += "\t" + b.toString() + "\n";
                }
            }
        }

        result += "\n----- End of list -----";

        return result;
    }

    public int getNumShelves(){
        return NUM_SHELVES;
    }
}