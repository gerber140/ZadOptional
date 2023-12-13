package pl.kurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Wojciech Suchodolski", "major@gmail.com");
        User user2 = new User(2, "Andrzej Kowalski", "akowal@gmail.com");
        User user3 = new User(3, "Krzystzof Kononowicz", "konon@gmail.com");
        ArrayList<User> users = new ArrayList<>(List.of(user1, user2, user3));


        Book book1 = new Book(1, "Lalka", "Bolesław Prus");
        Book book2 = new Book(2, "Pan Tadeusz", "Adam Mickiewicz");
        Book book3 = new Book(3, "1984", "George Orwell");
        ArrayList<Book> books = new ArrayList<>(List.of(book1, book2, book3));


        Book.borrowBook(book1, user1);
        System.out.println();
        Book.borrowBook(book1, user2);
        System.out.println();
        Book.bookInfo(book1);
        System.out.println();
        Book.bookInfo(book2);
        System.out.println();

        System.out.println(Book.findBookById(books, 1));
        System.out.println();
        System.out.println(Book.findBookById(books, 4));


    }
}