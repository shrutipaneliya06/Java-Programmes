import java.applet.Applet;  
import java.awt.Graphics; 

public class smiley extends Applet
{  
 public void paint(Graphics g)
 {
  g.drawOval(90, 80, 200, 200);
  g.fillOval(130, 120, 45, 45);
  g.fillOval(210, 120, 45, 45);
  g.drawArc(160, 200, 60, 50, 0, -180);
 }
}  

/* <applet code="smiley.class" width="500" height="500">
   </applet>
*/