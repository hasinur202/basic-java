
package bankaccount;

public class SavingAccount extends BankAccount {
           
        double interestRate;
        
        SavingAccount(int accNum, double balance, double interestRate){
        super(accNum,balance);
        this.interestRate = interestRate;
        addInterest(balance);
        super.getBalance();
    }
      
        
        public void addInterest(double b){
        this.totalBalance = b+(interestRate/100);
        
        }   
   
}
