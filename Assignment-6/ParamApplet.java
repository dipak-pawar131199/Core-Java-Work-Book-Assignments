import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
  <applet code=ParamApplet.class width=500 height=300>
  <param name=str value="good morning dipak">
  </applet>
*/

public class ParamApplet extends Applet
{
  String msg="",vowel="";
  int x=10,y=20;
  char ch[]={'a','e','i','o','u'};
  public void init()
  {
    
    msg=getParameter("str");
  }
  public void paint(Graphics g)
  {
      g.drawString(msg,x,y);
      char mc[]=msg.toCharArray();
      int x1=20,y1=20;
      
      for(int i=0;i<mc.length;i++)
      {
         for(int j=0;j<ch.length;j++)
          {
            if(ch[j]==mc[i])
            {
               vowel+=String.valueOf(ch[j]);
             
            }
          }
      }
     showStatus(vowel);
  }
}
