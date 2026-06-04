public class Library {
    public static void main(String[] args) {
        LibraryCatalog catalog1 = LibraryCatalog.getInstance();
        LibraryCatalog catalog2 = LibraryCatalog.getInstance();
        System.out.println(catalog1.hashCode());
        System.out.println(catalog2.hashCode());

        User student = UserFactory.createUser("Student", "Somya");
        student.displayRole();
        User faculty = UserFactory.createUser("Faculty", "Lata");
        faculty.displayRole();

        Book book = new Book.BookBuilder() .setTitle("Design Pattern") .setAuthor("GoF") 
        .setEdition("2nd") .setGenre("Software Engineering") .build();
        book.displayBook();
    }
}