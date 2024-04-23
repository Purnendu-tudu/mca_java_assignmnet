public class ShowMethod {
    public void show(int num) {
        System.out.println("Integer argument: " + num);
    }
    
    public void show(double num) {
        System.out.println("Double argument: " + num);
    }
    
    public static void main(String[] args) {
        ShowMethod obj = new ShowMethod();
        short shortParam = 10;
        double doubleParam = 20.5;
        
        obj.show(shortParam);
        obj.show(doubleParam);
    }
}
