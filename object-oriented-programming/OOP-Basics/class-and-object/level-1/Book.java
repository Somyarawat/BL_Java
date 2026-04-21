class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println(title + " by " + author + ": Price " + price );
    }

    public static void main(String[] args) {
        Book b = new Book("Romeo and Juliet", "William Shakespeare", 750);
        b.display();
    }
}