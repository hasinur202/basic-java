
package bankaccount;


public class BankAccount {
    int accountNumber;
    double totalBalance;
    
    BankAccount(int accountNumber, double totalBalance){
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        
    }
    double deposit(double amm){
        this.totalBalance=totalBalance+amm;
        return totalBalance;
    }
    double withdraw(double money){
        this.totalBalance = totalBalance-money;
        return totalBalance;
    }
    
    void getBalance(){
        System.out.println("Your balance is: "+totalBalance);
        
    }
}
