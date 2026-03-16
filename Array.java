package com.codegnan.arrays;
import java.util.*;
class Array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=1;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=1;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println();
System.out.println(a.length);
//enhanced loop
for(int n:a)
{
System.out.println(a);
}
}
}