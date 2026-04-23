class BookLibrary {

    static String libraryName = "Central Library";
    final int isbn;

    String title, author;

    BookLibrary(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    void display() {
        System.out.println(title + " " + author + " " + isbn);
    }

    public static void main(String[] args) {

        BookLibrary b = new BookLibrary("Java", "James", 123);

        if (b instanceof BookLibrary) {
            b.display();
        }

        BookLibrary.displayLibraryName();
    }
}