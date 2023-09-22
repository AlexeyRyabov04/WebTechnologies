package by.bsuir.main.task16;

import by.bsuir.main.task12_14_15.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("123456", "Автор 4", 20, "B124"));
        books.add(new Book("987654", "Автор 2", 25, "A234"));
        books.add(new Book("555555", "Автор 1", 15, "C453"));
        books.add(new Book("555555", "Автор 3", 15, "C453"));
        books.add(new Book("123456", "Автор 4", 15, "B124"));
        Collections.sort(books, new TitleComparator());
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
        Collections.sort(books, new TitleAuthorComparator());
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
        Collections.sort(books, new AuthorTitleComparator());
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
        Collections.sort(books, new AuthorTitlePriceComparator());
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
