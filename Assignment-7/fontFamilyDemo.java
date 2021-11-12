import java.awt.*;
import java.applet.*;

/*
<applet code=fontFamilyDemo.class width=200 height=1000></applet>
*/
public class fontFamilyDemo extends Applet
{
  

  
 public void paint(Graphics g)
 {
   GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();  
   String ffamily[]=ge.getAvailableFontFamilyNames();
   int y=20;//i=0;
  /* while (i<ffamily.length)
   {
      g.drawString(ffamily[i],10,y);
   
      i+=1;
      y=y+10   ;
   }*/
   for(int i=0;i<ffamily.length;i++)
   {
         g.drawString(ffamily[i],10,y);
         y=y+20;
   }
   
   
   
  } 
}
