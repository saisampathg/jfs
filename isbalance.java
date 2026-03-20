import java.util.*;
class isbalance
{
    String accountHolderName;
    int accountNumber;
    double balance;

    public static void main(String args[])
    {
        isbalance bank = new isbalance();
        bank.accountHolderName="Sampath";
        bank.accountNumber=200530;
        bank.balance=100;
        System.out.println(bank.cbalance());
        System.out.println(bank.accountholdername());
        bank.deposit(550.00);
        System.out.println("Updated balance: "+bank.cbalance());
        bank.withdrawal(200.00);
        System.out.println("Updated balance after withdrawal: "+bank.cbalance());
        boolean isValid = bank.isbalance(1000.00);
        {
            if(isValid)
            System.out.println("you have sufficient amount to withdraw");
            else
            System.out.println("you don't have sufficient amount to withdraw");
        }
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

    public void withdrawal(double amount)
    {
        balance-=amount;
        System.out.println("after withdrawing the amount: "+amount);
    }

    public boolean isbalance(double amount)
    {
        if(amount<=balance)
        return true;
        else
        return false;
    }
}