package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public int getBalance() {
        return this.balance;
    }

    //public method : deposit
    public void deposit(int amount){
        if(isAmountBValid(amount)) {
            this.balance += amount;
        }else{
            System.out.println("Invalid amount");
        }
    }

    //public method : withdraw
    public void withdraw(int amount){
        if(isAmountBValid(amount)
            && this.balance - amount >= 0) {
            this.balance -= amount;
        }else{
            System.out.println("Invalid amount");
        }
    }

    //private method : isAmountVaild
    private boolean isAmountBValid(int amount){
        return amount > 0 ;
    }

}
