package by.bsuir.tests.task15;

import by.bsuir.main.task12_14_15.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void compareTo_GiveListOfBooks_ReturnSortedList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("123456", "Автор 1", 20, "B124"));
        books.add(new Book("987654", "Автор 2", 25, "A234"));
        books.add(new Book("555555", "Автор 3", 15, "C453"));
        List<Book> expected = new ArrayList<>(List.of(books.get(1), books.get(0), books.get(2)));
        Collections.sort(books);
        assertArrayEquals(expected.toArray(), books.toArray());
    }
}