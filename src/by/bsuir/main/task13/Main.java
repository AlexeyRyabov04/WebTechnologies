package by.bsuir.main.task13;

public class Main {
    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("abc", "aa", "", 10, "eng", 19);
        ProgrammerBook book2 = new ProgrammerBook("abc", "aa", "", 10, "eng", 19);
        System.out.println(book1.equals(book2));
        System.out.println(book1.toString());
        System.out.println(book1.hashCode());
    }
}
