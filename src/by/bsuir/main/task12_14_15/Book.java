package by.bsuir.main.task12_14_15;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private String isbn;
    private static int edition;

    public Book(String title, String author, int price, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book)obj;
        return (book.getTitle().equals(title)
                && book.getAuthor().equals(author)
                && book.getPrice() == price
                && book.getIsbn().equals(isbn));
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", price: " + price;
    }

    @Override
    public Object clone(){
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Book book) {
        return isbn.compareTo(book.getIsbn());
    }
}
