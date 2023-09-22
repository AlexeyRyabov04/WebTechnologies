package by.bsuir.tests.task14;

import by.bsuir.main.task12_14_15.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testClone_MakeClone_ReturnCopyOfBook() {
        Book book = new Book("title", "author", 1, "abc");
        Book copy = (Book) book.clone();
        assertTrue(book.equals(copy) && book != copy);
    }
}