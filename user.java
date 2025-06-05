import java.util.*;

class user
{
 public static void main(String args[])
 {
  System.out.print("enter name :");
  Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  System.out.print("enter age :");
  Scanner sc2=new Scanner(System.in);
  int age=sc2.nextInt();
  System.out.println("user name is "+name+" and age is "+age);
 }
}