public class StudentT {
    private int roll;
    private String name;
    private double score;
    
    public StudentT() {
        this.roll = 0;
        this.name = "";
        this.score = 0.0;
    }
    
    public StudentT(int roll) {
        this.roll = roll;
        this.name = "";
        this.score = 0.0;
    }
    
    public StudentT(int roll, String name) {
        this.roll = roll;
        this.name = name;
        this.score = 0.0;
    }
    
    public StudentT(int roll, String name, double score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }
    
    public StudentT(StudentT other) {
        this.roll = other.roll;
        this.name = other.name;
        this.score = other.score;
    }
    
    public static void main(String[] args) {
        Student student1 = new StudentT(101, "John", 85.5);
        Student student2 = new StudentT(student1);
        
        System.out.println("Student 1:");
        student1.displayAttributes();
        
        System.out.println("\nStudent 2:");
        student2.displayAttributes();
    }
}
