import java.util.*;
class deposit
{
    String accountHolderName;
    int accountNumber;
    double balance;

    public static void main(String args[])
    {
        withdraw bank = new withdraw();
        bank.accountHolderName="Sampath";
        bank.accountNumber=20030;
        bank.balance=100;
        System.out.println(bank.cbalance());
        System.out.println(bank.accountholdername());
        bank.deposit(550.00);
        System.out.println("Updated balance: "+bank.cbalance());
    }

    public double cbalance()
    {
        return balance;
    }

    public String accountholdername()
    {
        return accountHolderName;
    }

    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("after depositing the amount: "+amount);
    }
}