class BookConstructor {
    String title;
    String author;
    double price;

    BookConstructor(){
        title = "unknown";
        author = "unknown";
        price = 0;
    }

    BookConstructor(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price);
    }

    public static void main(String[] args) {
        BookConstructor b1 = new BookConstructor();
        BookConstructor b2 = new BookConstructor("Romeo and Juliet", "William Shakespeare", 750);
        b1.display();
        b2.display();
    }
}