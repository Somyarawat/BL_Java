class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String name, int time, double fee) {
        courseName = name;
        duration = time;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " years " + " with fee " + fee + " in institute " + instituteName);
    }

    static void updateInstituteName(String i) {
        instituteName = i;
    }

    public static void main(String[] args) {
        Course c = new Course("Java", 3, 5000);
        c.displayCourseDetails();
        Course.updateInstituteName("XYZ Institute");
        c.displayCourseDetails();
    }
}