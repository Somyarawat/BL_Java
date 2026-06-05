class ParseTypes{
    public static void main(String[] args) {
        String line = "101,Somya,21,Java";
        String[] data = line.split(",");
        int id = Integer.parseInt(data[0]);
        String name = data[1];
        int age = Integer.parseInt(data[2]);
        String course = data[3];
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}