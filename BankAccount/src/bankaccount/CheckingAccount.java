
package bankaccount;

public class CheckingAccount extends BankAccount {
    final int fee=5;
    
    CheckingAccount(int AccNum, double balance){
        super(AccNum,balance);
        
        deductFee(balance); 
        super.getBalance();       
    }
    
    public void deductFee(double money){
        super.totalBalance=money-fee;
        
    }
    
}
