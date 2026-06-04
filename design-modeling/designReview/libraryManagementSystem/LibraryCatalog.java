class LibraryCatalog{
    private static LibraryCatalog instance;

    private LibraryCatalog(){}

    public static synchronized LibraryCatalog getInstance(){
        if(instance == null){
            instance = new LibraryCatalog();
        }
        return instance;
    }
}