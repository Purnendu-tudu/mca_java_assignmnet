public class BankAcct {
    private int accountNumber;
    private double balance;
    private static double interestRate = 0.05; // Assuming a default interest rate
    
    public BankAcct(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate);
    }
    
    public double calculateInterest() {
        return balance * interestRate;
    }
    
    public static void main(String[] args) {
        BankAcct account = new BankAcct(123456, 1000.0);
        account.displayInterestRate();
        
        double interest = account.calculateInterest();
        System.out.println("Interest earned: " + interest);
    }
}
