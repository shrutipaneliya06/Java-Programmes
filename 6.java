interface multiple
{
 void what();
}

interface inheritance
{
 void how();
}

class proven implements multiple,inheritance
{
 public void what()
 {
  System.out.println("Multiple Inheritance");
 }
 public void how()
 {
  System.out.println("Using Interface");
 }
 public static void main(String args[])
 {
  proven p = new proven();
  p.what();
  p.how();
 }
}