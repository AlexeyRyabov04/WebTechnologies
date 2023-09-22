package by.bsuir.main.task16;

import by.bsuir.main.task12_14_15.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison == 0) {
            int titleComparison = book1.getTitle().compareTo(book2.getTitle());
            if (titleComparison == 0) {
                return Integer.compare(book1.getPrice(), book2.getPrice());
            }
            return titleComparison;
        }
        return authorComparison;
    }
}

