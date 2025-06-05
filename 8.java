class exception
{
 public static void main(String args[])
 {
  try
  {
   System.out.println("Going To Divide");
   int b =49/0;
  }
  catch(ArithmeticException e)
  {
   System.out.println(e);
  }
 }
}