package question_11.com.tudu.hacks.model;

public class Instructor {
    private String name;
    private String phoneNumber;

    public Instructor(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void viewInstructorInfo() {
        System.out.println("Instructor Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public void setInstructorInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}