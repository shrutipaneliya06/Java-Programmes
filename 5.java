interface area    
{     
 int calc(int x,int y);
}    
    
class rectangle implements area    
{    
 public int calc(int x,int y)    
 {    
  return(x*y);     
 }    
}    

class triangle implements area    
{    
 public int calc(int x,int y)    
 {    
  return(x*y/2);       
 }      
}    
    
class square implements area    
{    
 public int calc(int x,int y)    
 {    
  return(x*y);        
 }      
}    
    
class test   
{    
 public static void main(String arg[])    
 {    
  rectangle r = new rectangle();    
  triangle t = new triangle();
  square s = new square();   
  area a;
  a = r;    
  System.out.println("Area of Rectangle is : " +a.calc(5,10)); 
  a = t;
  System.out.println("Area of Triangle is : " +a.calc(10,8));     
  a = s;
  System.out.println("Area of Square is : " +a.calc(10,10));     
 }    
}  