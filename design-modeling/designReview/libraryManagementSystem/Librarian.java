class Librarian implements User{
    private String name;
    public Librarian(String name){
        this.name = name;
    }
    @Override
    public void displayRole(){
        System.out.println(name + " is a librarian");
    }
}