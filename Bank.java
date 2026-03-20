import java.util.*;
class Bank
{
String accountname;
int accnumber;
double balance;
public static void main(String args[])
{
Bank bk=new Bank();
bk.accountname="Sampath";
bk.accnumber=123456;
bk.balance=500.243;
bk.displayaccountdetails();
bk.checkBalance();
}
public void checkBalance()
{
if(balance<1000)
{
System.out.println("Insufficient Balance");
}
}
public void displayaccountdetails()
{
System.out.println("account name: " +accountname);
System.out.println("account number: " +accnumber);
System.out.println("account balance: " +balance);
}
}


