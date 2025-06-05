class calculate
{
 void area(double r)
 {
  double cir=3.14*r;
  System.out.println("Area of Circle :"+cir);
 }
 
 void area(int l,int b)
 {
  int rect=l*b;
  System.out.println("Area of Rectangle :"+rect);
 }

 void area(int l)
 {
  int squ=l*l;
  System.out.println("Area of Square :"+squ);
 }

 public static void main(String args[])
 {
  calculate c = new calculate();
  calculate r = new calculate();
  calculate s = new calculate();

  c.area(3.0);
  r.area(5,4);
  s.area(5);
 }
}