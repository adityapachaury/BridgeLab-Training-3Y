
// Online Course Management
class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "GLA University";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 15000);
        c1.displayCourseDetails();
        Course.updateInstituteName("GLA CSE Department");
        Course c2 = new Course("Python", 4, 12000);
        c2.displayCourseDetails();
    }
}
