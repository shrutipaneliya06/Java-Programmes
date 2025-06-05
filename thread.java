import java.io.*;
import java.lang.Thread;

class th1 extends Thread
{
  public void run()
  {
   System.out.println("shruti");
   try
   { Thread.sleep(5000); }
   catch(Exception e)
   {System.out.println(e);}
   System.out.println("c++");
  }
}

class test
{
 public static void main(String args[])
 {
  th1 t1=new th1();
  t1.start();
 }
}