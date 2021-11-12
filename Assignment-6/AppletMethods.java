import java.awt.*;
import java.applet.*;

/*<applet code=AppletMethods.class width=500 height=300></applet>*/
public class AppletMethods extends Applet
{
   String msg="";
   public void init()
   {
      setBackground(Color.blue);  
      
 
     msg+="In init method!!!";
   }
   public void start()
   {
     msg+="In start method!!!";
   }
   public void stop()
   {
     msg+="In stop method!!!";
   }
   public void distroy()
   {
        msg+="In distroy method!!!";
   }
   public void paint(Graphics g)
   {
        msg+="In paint method!!!";
      
         g.setColor(Color.yellow);      
        g.drawString(msg,50,50);
   }
}
