import java.applet.Applet;  
import java.awt.Graphics; 

public class star extends Applet
{
 public void paint(Graphics g)
 {
  g.drawLine(179,72,198,141);
  g.drawLine(198,141,258,142);
  g.drawLine(258,142,212,184);
  g.drawLine(212,184,228,251);
  g.drawLine(228,251,179,216);
  g.drawLine(179,216,129,254);
  g.drawLine(129,254,146,184);
  g.drawLine(146,184,99,141);
  g.drawLine(99,141,160,141);
  g.drawLine(160,141,179,72);
 }
}

/* <applet code="star.class" width="500" height="500">
   </applet> */