import java.util.*;

class Book {
    String title, author;

    Book(String t, String a) {
        this.title = t;
        this.author = a;
    }

    void display() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book b) {
        books.add(b);
    }

    void display() {
        System.out.println("Library: " + name);
        for (Book b : books) b.display();
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "James");
        Book b2 = new Book("Python", "Guido");

        Library l1 = new Library("City Library");
        l1.addBook(b1);
        l1.addBook(b2);

        l1.display();
    }
}