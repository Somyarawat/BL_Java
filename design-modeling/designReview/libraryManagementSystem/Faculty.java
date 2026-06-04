class Faculty implements User{
    private String name;
    public Faculty(String name){
        this.name = name;
    }
    @Override
    public void displayRole(){
        System.out.println(name + " is a faculty");
    }
}