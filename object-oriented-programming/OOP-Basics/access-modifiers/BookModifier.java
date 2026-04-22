class BookModifier {

    public int ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {

        EBook e = new EBook();

        e.ISBN = 12345;                 
        e.title = "Java Programming";   
        e.setAuthor("James");          

        e.display();
    }
}

class EBook extends BookModifier {

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);

        System.out.println("Author: " + getAuthor()); 
    }
}