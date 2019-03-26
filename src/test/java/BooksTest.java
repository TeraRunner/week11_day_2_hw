import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BooksTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Fellowship of the ring", "Tolkien", "Fantasy");
    }

    @Test
    public void classTest() {
        assertEquals("Fellowship of the ring", book.getTitle());
        assertEquals("Tolkien", book.getAuthor());
        assertEquals("Fantasy", book.getGenre());
    }

}
