package by.bsuir.tests.task16;

import by.bsuir.main.task12_14_15.Book;
import by.bsuir.main.task16.TitleAuthorComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TitleAuthorComparatorTest {

    @Test
    void compare_GiveBooksWithDifferentTitles_ReturnListSortedByTitle() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("123456", "Автор 4", 20, "B124"));
        books.add(new Book("987654", "Автор 2", 25, "A234"));
        books.add(new Book("555555", "Автор 1", 15, "C453"));
        books.add(new Book("789004", "Автор 3", 15, "C453"));
        books.add(new Book("789005", "Автор 5", 15, "B124"));
        List<Book> expected = new ArrayList<>(List.of
                (books.get(0), books.get(2), books.get(3), books.get(4), books.get(1))
        );
        books.sort(new TitleAuthorComparator());
        assertArrayEquals(expected.toArray(), books.toArray());
    }

    @Test
    void compare_GiveBooksWithSameTitlesAndDifferentAuthors_ReturnListSortedByTitleAndAuthor() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("123456", "Автор 3", 20, "B124"));
        books.add(new Book("987654", "Автор 5", 25, "A234"));
        books.add(new Book("555555", "Автор 1", 15, "C453"));
        books.add(new Book("987654", "Автор 2", 15, "C453"));
        books.add(new Book("123456", "Автор 4", 15, "B124"));
        List<Book> expected = new ArrayList<>(List.of
                (books.get(0), books.get(4), books.get(2), books.get(3), books.get(1))
        );
        books.sort(new TitleAuthorComparator());
        assertArrayEquals(expected.toArray(), books.toArray());
    }

    @Test
    void compare_GiveBooksWithAllSameTitlesAndDifferentAuthors_ReturnListSortedByAuthor() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("123456", "Автор 3", 20, "B124"));
        books.add(new Book("123456", "Автор 5", 25, "A234"));
        books.add(new Book("123456", "Автор 1", 15, "C453"));
        books.add(new Book("123456", "Автор 2", 15, "C453"));
        books.add(new Book("123456", "Автор 4", 15, "B124"));
        List<Book> expected = new ArrayList<>(List.of
                (books.get(2), books.get(3), books.get(0), books.get(4), books.get(1))
        );
        books.sort(new TitleAuthorComparator());
        assertArrayEquals(expected.toArray(), books.toArray());
    }

    @Test
    void compare_GiveBooksWithAllSameTitlesAndAllSameAuthors_ReturnSameList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("123456", "Автор 1", 20, "B124"));
        books.add(new Book("123456", "Автор 1", 25, "A234"));
        books.add(new Book("123456", "Автор 1", 15, "C453"));
        books.add(new Book("123456", "Автор 1", 15, "C453"));
        books.add(new Book("123456", "Автор 1", 15, "B124"));
        List<Book> expected = new ArrayList<>(List.of
                (books.get(0), books.get(1), books.get(2), books.get(3), books.get(4))
        );
        books.sort(new TitleAuthorComparator());
        assertArrayEquals(expected.toArray(), books.toArray());
    }
}