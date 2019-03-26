import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Fellowship of the ring","Tolkien","Fantasy");
    }

    @Test
    public void booksOnStock() {
        assertEquals(0, library.getLibraryStock());
    }

    @Test
    public void addBookToStock() {
        library.capacity = 1;
        library.addBook(book);
        assertEquals(1, library.getLibraryStock());
    }

    @Test
    public void checkAvailabilityTest() {
        library.capacity = 1;
        library.addBook(book);
        assertEquals("Not enough space", library.checkAvailability());
    }

}
