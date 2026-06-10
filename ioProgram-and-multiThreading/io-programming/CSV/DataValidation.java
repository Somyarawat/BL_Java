
class DataValidation{
    public static void main(String[] args) {
        String line = "101,Somya,21,Java";
        String[] data = line.split(",");
        int id = Integer.parseInt(data[0]);
        if(id <= 0){
            System.out.println("ID: Invalid ID");
        }
        else{
            System.out.println("ID: " + id);
        }
        String name = data[1];
        if(name.isEmpty()){
            System.out.println("Name: Fill the name");
        }
        else{
            System.out.println("Name: " + name);
        }
        int age = Integer.parseInt(data[2]);
        if(age <= 0){
            System.out.println("Age: Invalid Age");
        }
        else{
            System.out.println("Age: " + age);
        }
        String course = data[3];
        if(course.isEmpty()){
            System.out.println("Course: Fill the course");
        }
        else{
            System.out.println("Course: " + course);
        }
    }
}