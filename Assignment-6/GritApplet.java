/*Write a program to display the current date and time using simple applet. Also display greeting
message like “Good Morning” or “Good Afternoon” or “Good Evening” depending on the
current time in the applet’s status window
*/

import java.awt.*;
import java.applet.*;
import java.util.*;
/* <applet code=GritApplet.class width=500 height=300>
   </applet>
 */  
public class GritApplet extends Applet
{
  long time; 
  public void paint(Graphics g)
  {
    Date d=new Date();
    g.drawString(d.toString(),20,20);
    Calendar cal=Calendar.getInstance();
    int hour=cal.get(cal.HOUR);
    if(hour<12)
      showStatus("Good Morning");
    else if(hour>=12 && hour<17)
      showStatus("Good Afternoon");
    else if(hour>=17 && hour<20)
       showStatus("Good Evening");
    else if(hour>=20 && hour<=24)
       showStatus("Good Night");       
     
  
  
   // g.drawString(String.valueOf(ampm),20,60);   
  } 
}
