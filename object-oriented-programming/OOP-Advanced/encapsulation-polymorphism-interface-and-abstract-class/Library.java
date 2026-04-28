interface Reservable {
    void reserveItem();
}

abstract class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract int getLoanDuration();

    void getDetails() {
        System.out.println("Title: " + title);
    }
}

class Book extends LibraryItem implements Reservable {
    Book(String t) { super(t); }

    @SuppressWarnings("override")
    int getLoanDuration() { return 14; }
    @SuppressWarnings("override")
    public void reserveItem() { System.out.println("Book Reserved"); }
}

class Magazine extends LibraryItem {
    Magazine(String t) { super(t); }

    @SuppressWarnings("override")
    int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    DVD(String t) { super(t); }

    @SuppressWarnings("override")
    int getLoanDuration() { return 3; }
}

public class Library {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("Java"),
            new Magazine("Tech"),
            new DVD("Movie")
        };

        for (LibraryItem i : items) {
            i.getDetails();
            System.out.println("Days: " + i.getLoanDuration());
        }
    }
}