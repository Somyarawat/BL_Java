class StudentModifier {

    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCgpa(double c) {
        cgpa = c;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {

        PostgraduateStudent p = new PostgraduateStudent();

        p.rollNumber = 1;          
        p.name = "Luv";   
        p.setCgpa(8.5);    
        p.showDetails();
    }
}

class PostgraduateStudent extends StudentModifier {

    void showDetails() {
        System.out.println("Roll: " + rollNumber);     
        System.out.println("Name: " + name);     
        
        System.out.println("CGPA: " + getCgpa()); 
    }
}