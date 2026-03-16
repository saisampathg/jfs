import java.util.*;
class Country
{
public static void main(String args[])
{
String a[]=new String[5];
a[0]="India";
a[1]="Malaysia";
a[2]="Africa";
a[3]="Asia";
a[4]="Russia";
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
System.out.println("------------------");
for(String b:a)
{
System.out.println(b);
}
}
}