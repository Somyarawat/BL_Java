class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void display() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " days");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean isRecorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayOnline() {
        display();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String name, int duration, String platform, boolean isRecorded,
                    double fee, double discount) {
        super(name, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayFull() {
        displayOnline();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

@SuppressWarnings("unused")
class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse obj = new PaidOnlineCourse(
                "Java Course", 30, "Udemy", true, 5000, 10
        );

        obj.displayFull();
    }
}