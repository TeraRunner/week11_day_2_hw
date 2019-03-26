import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryStock;
    public int capacity;

    public Library() {
        this.libraryStock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getLibraryStock() {
        return this.libraryStock.size();
    }

    public void addBook(Book book) {
        this.libraryStock.add(book);
    }

    public String checkAvailability() {
        if (this.getLibraryStock() < this.capacity); {
            return "Not enough space";
        }
    }

}

//Books should have title, author and genre.
//Write a method to count the number of books in the library.
//Write a method to add a book to the library stock.
//Add a capacity to the library and write a method to check if stock is
//full before adding a book.

//Add a third class which interacts with the other two. E.g. you
//could add a Borrower with a method that takes a Book and moves to
//the Borrower's collection.