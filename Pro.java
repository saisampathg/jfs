import java.util.*;
class Pro
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
switch(n)
{
case "monday":
System.out.println("Monday is Day 2 of week");
break;
case "tuesday":
System.out.println("Tuesday is Day 3 of week");
break;
case "wednesday":
System.out.println("Wednesday is Day 4 of week");
break;
case "thursday":
System.out.println("Thursday is Day 5 of week");
break;
case "friday":
System.out.println("Friday is Day 6 of week");
break;
case "saturday":
System.out.println("Saturday is Day 7 of week");
break;
case "sunday":
System.out.println("Sunday is Day 0 of week");
break;
default:
System.out.println("Not a Day");
break;
}
}
}

