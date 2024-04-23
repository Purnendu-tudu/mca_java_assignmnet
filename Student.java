public class Student {
    private int roll;
    private String name;
    private double score;
    
    public void setAttributes(int roll, String name, double score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }
    
    public void displayAttributes() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
    
    public void copyTo(Student other) {
        other.roll = this.roll;
        other.name = this.name;
        other.score = this.score;
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAttributes(101, "John", 85.5);
        
        Student student2 = new Student();
        student1.copyTo(student2);
        
        System.out.println("Student 1:");
        student1.displayAttributes();
        
        System.out.println("\nStudent 2:");
        student2.displayAttributes();
    }
}
