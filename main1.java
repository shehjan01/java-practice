public class main1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123456", 1000.0, 0.05);
        bankAccount.deposit(500.0);
        System.out.println("BankAccount balance: " + bankAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("789101", 2000.0, 0.03, 500.0);
        savingsAccount.deposit(300.0);
        System.out.println("SavingsAccount balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(250.0);
        System.out.println("SavingsAccount balance after withdrawal:" + savingsAccount.getBalance());
    }
}