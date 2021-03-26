
package bankaccount;

public class TestAccount {
    public static void main(String[] args) {
        
        BankAccount ob1 = new BankAccount(121, 4000);
        
        double b1 = ob1.deposit(500);
      
        System.out.println("Your balance is :"+b1);
        
        double b2 = ob1.withdraw(300);
        System.out.println("Your balance is :"+b2);
        
        
        SavingAccount ob2 = new SavingAccount(121, 200, 20);
        
        CheckingAccount ob3 = new CheckingAccount(121, 150);
        
        
        
    }
    
}
