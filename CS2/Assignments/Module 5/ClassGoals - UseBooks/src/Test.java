
class Test {

    public static void main(String[] args){

        //Generate 10 books and add to random shelves
        Book b1 = new Book("Cat Butts: A Coloring Book", "Val Brains", 1545200103L);
        Book b2 = new Book("How to Tell If Your Cat Is Plotting to Kill You", "Matt Inman", 1449410243L);
        Book b3 = new Book("I Run on Coffee, Sarcasm & Lipstick", "Papeterie Bleu", 1640010703L);
        Book b4 = new Book("Calm the Fuck Down and Color", "Jade Summer", 1537779157L);
        Book b5 = new Book("Crap Taxidermy", "Kat Su", 1607748207L);
        Book b6 = new Book("How to Talk to Your Cat About Gun Safety", "Zach Auburn", 451494924L);
        Book b7 = new Book("The Screaming Goat", "Running Press", 1762459810L);
        Book b8 = new Book("Shit I Can't Remember My Internet Password", "District Press", 1726381617L);
        Book b9 = new Book("Why My Cat Is More Impressive Than Your Baby", "Matt Inman", 1524850624L);
        Book b10 = new Book("Strange Planet", "Nathan W. Pyle", 9062970704L);

        Bookcase library = new Bookcase();
        library.addBook(1, b1);
        library.addBook(1, b2);
        library.addBook(1, b3);
        library.addBook(1, b4);
        library.addBook(1, b5);
        library.addBook(2, b6);
        library.addBook(3, b7);
        library.addBook(4, b8);
        library.addBook(4, b9);
        library.addBook(2, b10);

        //Let's see what we've got in the library
        System.out.println(library.toString() + "\n");

        //Generate a few readers with different constructors
        Reader alan = new Reader("Alan");
        Reader sam = new Reader("Sam", new Book("How it Works: The Husband", "Jason Hazeley",
                9780718183561L));

        System.out.println(alan.toString());
        System.out.println(sam.toString());

        System.out.println("\n----- Add / Take Book Tests -----\n");

        //Test the functions

        //Sam already has a book, won't give them another.
        sam.attemptToTakeBook(library, b7);

        //Return the book and then take another
        sam.returnBook(library, sam.getCurrentBook());
        sam.attemptToTakeBook(library, b7);

        //Book doesn't exist in library, will not give book to reader
        alan.attemptToTakeBook(library, b7);

    }

}