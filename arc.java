import java.applet.*;
import java.awt.*;

public class arc extends Applet
{
 public void paint(Graphics g)
 {
  g.setColor(color.blue);
  g.fillArc(160,200,150,140,0,250);
 }
}

/* <applet code="arc.class" width="500" height="500">
   </applet> */