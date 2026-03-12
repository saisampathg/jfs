import java.util.*;
class Age
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Marks ");
int n=sc.nextInt();
if(n<=27)
System.out.println("Fail");
else if(n>=28 && n<=50)
System.out.println("Grade C");
else if(n>=51 && n<=70)
System.out.println("Grade B");
else if(n>=71 && n<=90)
System.out.println("Grade A");
else
System.out.println("No Grade");
}
}