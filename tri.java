import java.applet.Applet;  
import java.awt.Graphics;  
  
public class tri extends Applet
{  
 public void paint(Graphics g)
 {
  
   g.drawLine(217,57,322,272); 
   g.drawLine(322,272,107,276); 
   g.drawLine(107,276,217,57); 
   g.drawOval(150,150,150,150);
 }   
}  

/* <applet code="tri.class" width="700" height="600">
   
   </applet>
*/