import java.applet.Applet;  
import java.awt.Graphics;  
  
public class square extends Applet
{  
 public void paint(Graphics g)
 {
  int n1 = Integer.parseInt(getParameter("p1")); 
  for(int i=1;i<n1;i++)  
  { 
   g.drawRect(50,50,100,100); 
   g.drawRect(200,200,100,100);
   g.drawRect(350,350,100,100);
   g.drawRect(500,200,100,100);
  }  
 }   
}  

/* <applet code="square.class" width="700" height="600">
   <param name="p1" value="4"></param> 
   </applet>
*/