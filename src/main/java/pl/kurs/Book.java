package pl.kurs;

import java.util.List;
import java.util.Optional;

public class Book {
    private long id;
    private String title;
    private String author;
    private User borrower;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Optional<User> getBorrower() {
        return Optional.ofNullable(borrower);
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public static void bookInfo(Book book){
        if(book.getBorrower().isPresent()){
            System.out.println("Książkę \"" + book.title + "\" wypożyczył: " + book.borrower);
        }
        else{
            System.out.println("Książka jest dostępna!");
        }
    }

    public static void borrowBook(Book book, User user) {
        if (book.getBorrower().isEmpty()) {
            book.setBorrower(user);
            System.out.println(user.getName() + " wypożyczył książkę: " + book.getTitle());
        } else {
            System.out.println("Książka jest już wypożyczona");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", borrower=" + borrower +
                '}';
    }
}
