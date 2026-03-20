import java.util.*;
class withdraw
{
    String accountHolderName;
    int accountNumber;
    double balance;

    public static void main(String args[])
    {
        withdraw bank = new withdraw();
        bank.accountHolderName="Uday";
        bank.accountNumber=200530;
        bank.balance=100;
        System.out.println(bank.cbalance());
        System.out.println(bank.accountholdername());
        bank.deposit(550.00);
        System.out.println("Updated balance: "+bank.cbalance());
        bank.withdrawal(200.00);
        System.out.println("Updated balance after withdrawal: "+bank.cbalance());
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
}