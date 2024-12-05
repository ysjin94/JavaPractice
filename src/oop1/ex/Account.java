package oop1.ex;

public class Account {
    private int balance = 0;

    public Account(int balance){
        this.balance = balance;
    }

    void deposit(int amount){
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + this.balance);
    }

    void withdraw(int amount){

        if(this.balance < amount){
            System.out.println("Insufficient Balance");
            System.out.println("Current balance : " + this.balance);
        }else {
            this.balance -= amount;
            System.out.println("Withdrawed " + amount + " to " + this.balance);
        }
    }

    void showBalance(){
        System.out.println("Current balance : " + this.balance);
    }
}
