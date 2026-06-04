class Student implements User{
    private String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public void displayRole(){
        System.out.println(name + " is a student");
    }
}