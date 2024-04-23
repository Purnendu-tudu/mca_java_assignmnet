package question_11;
import question_11.com.tudu.hacks.model.*;


public class Main {
    public static void main(String[] args) {
        // Create an Instructor object
        Instructor instructor = new Instructor("John Doe", "123-456-7890");

        // Create a Textbook object
        Textbook textbook = new Textbook("Java Programming", "Jane Smith", "ABC Publications");

        // Create a Course object with the Instructor and Textbook objects
        Course course = new Course("Introduction to Java", instructor, textbook);

        // View Course Information
        course.viewCourseInfo();
    }
}
