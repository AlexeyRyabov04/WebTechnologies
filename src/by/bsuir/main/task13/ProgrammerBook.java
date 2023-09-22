package by.bsuir.main.task13;

import by.bsuir.main.task12_14_15.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, String isbn, int price, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public boolean equals(Object obj) {
        ProgrammerBook book = (ProgrammerBook) obj;
        return (book.getTitle().equals(this.getTitle())
                && book.getAuthor().equals(this.getAuthor())
                && book.getPrice() == this.getPrice())
                && book.getIsbn().equals(this.getIsbn())
                && book.getLanguage() == language
                && book.getLevel() == level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getAuthor(), language, level);
    }

    @Override
    public String toString() {
        return "title: " + getTitle() + ", author: " + getAuthor() + ", price: " + getPrice()
                + ", language: " + language + ", level: " + level;
    }
}
