class Book {
    private String title;
    private String author;
    private String edition;
    private String genre;

    private Book(BookBuilder b){
        this.title = b.title;
        this.author = b.author;
        this.edition = b.edition;
        this.genre = b.genre;
    }

    public void displayBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
        System.out.println("Genre: " + genre);
    }


    static class BookBuilder{
        private String title;
        private String author;
        private String edition;
        private String genre;

        public BookBuilder setTitle(String title){
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author){
            this.author = author;
            return this;
        }

        public BookBuilder setEdition(String edition){
            this.edition = edition;
            return this;
        }

        public BookBuilder setGenre(String genre){
            this.genre = genre;
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }
}