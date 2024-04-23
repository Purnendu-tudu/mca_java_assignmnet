package question_11.com.tudu.hacks.model;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void setCourseInfo(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void viewCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor Information:");
        instructor.viewInstructorInfo();
        System.out.println("Textbook Information:");
        textbook.viewTextbookInfo();
    }
}