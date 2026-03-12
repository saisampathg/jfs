import java.util.*;
class Variable
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Student name: ");
String s=sc.nextLine();
System.out.print("Student age: ");
int age=sc.nextInt();
System.out.print("Enter grades: ");
char c=sc.next().charAt(0);
System.out.print("Enter marks: ");
int d=sc.nextInt();
System.out.print("is passed: ");
boolean b=sc.nextBoolean();
System.out.print("\n");
System.out.println("STUDENT DETAILS");
System.out.println("Student Name: "+s);
System.out.println("Student Age: "+age);
System.out.println("Student Grade: "+c);
System.out.println("Student Marks: "+d);
System.out.println("Student Passed: "+b);
}
}
