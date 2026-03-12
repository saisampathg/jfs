public class Cast
{
public static void main(String args[])
{
byte b=10;
int i=b;
double d=i;
double e = 40.5;
int a = (int)e;
byte n = (byte)a;
System.out.println("Widening or automatic or implicit"); 
System.out.printf("%d%n%d%n%f",b,i,d);
System.out.println();
System.out.println("Narrowing or explicit");
System.out.printf("%f%n%d%n%d", e,a,n);
}
}
