package by.bsuir.main.task12_14_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("abc", "aa", 10, "");
        Book book2 = new Book("abc", "aab", 10, "");
        System.out.println(book1.equals(book2));
        System.out.println(book1.toString());
        System.out.println(book1.hashCode());
        Book book3 = (Book)book1.clone();
        System.out.println(book3.getTitle() + " " + book3.getAuthor() + " " + book3.getPrice());
        System.out.println(book3.equals(book1));
        List<Book> books = new ArrayList<>();
        books.add(new Book("123456", "Автор 1", 20, "B124"));
        books.add(new Book("987654", "Автор 2", 25, "A234"));
        books.add(new Book("555555", "Автор 3", 15, "C453"));
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
