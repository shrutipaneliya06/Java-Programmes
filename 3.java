class student
{
 int rollno;
 String name;
 void assdis(int r,String n)
 {
  rollno=r;
  name=n;
  System.out.println("RollNo :"+r+"\nName :"+n);
 }
}

class details
{
 public static void main(String args[])
 {
  student s = new student();
  s.assdis(1,"krupali");
 }
}