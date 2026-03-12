import java.util.*;
class Arth
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
int a=sc.nextInt();
int b=sc.nextInt();
ch=sc.next().charAt(0);
switch(ch)
{
case  '+':
int sum=a+b;
System.out.println("Sum "+sum);
break;
case '-':
int diff=a-b;
System.out.println("Diff "+diff);
break;
case '*':
int mul=a*b;
System.out.println("Mul "+mul);
break;
default:
System.out.println("Error");
}
}
}