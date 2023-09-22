package by.bsuir.main.task16;

import by.bsuir.main.task12_14_15.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison == 0) {
            return book1.getTitle().compareTo(book2.getTitle());
        }
        return authorComparison;
    }
}
