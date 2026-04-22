class LibraryBook {
    @SuppressWarnings("unused")
    String title;
    @SuppressWarnings("unused")
    String author;
    @SuppressWarnings("unused")
    double price;
    boolean availability = true;

    void borrow(){
        if(availability) {
            availability = false;
            System.out.println("Book Borrowed");
        }
        else{
            System.out.println("Book is not available");
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.borrow();
        }
}