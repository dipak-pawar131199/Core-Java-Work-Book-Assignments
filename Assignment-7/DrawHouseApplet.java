import java.applet.*;
import java.awt.*;

//<applet code=DrawHouseApplet.class width=1000 height=1000></applet>

public class DrawHouseApplet extends Applet
{
  int x[]={300,100,500};
  int y[]={10,500,500};
  int numpoints=3;
  public void paint(Graphics g)
  {
    
     g.setColor(Color.red);
     
     g.fillPolygon(x,y,numpoints);
     
     g.setColor(Color.yellow);
     g.fillRect(100,500,400,600);
     g.setColor(Color.white);
     g.fillRect(250,800,100,900);
     
  }
}
