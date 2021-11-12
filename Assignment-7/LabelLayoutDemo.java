import java.awt.*;
import java.applet.*;

/* 
<center>
  <applet code=LabelLayoutDemo.class width=500 height=300>
  </applet>
</center>
*/

public class LabelLayoutDemo extends Applet
{
  Label l1,l2,l3,l4;
  
  public void init()
  {
    setLayout(new GridLayout(2,2));
    l1=new Label("Mouse X");
    l2=new Label("Mouse X coordinate");
    l3=new Label("Mouse Y");
    l4=new Label("Mouse Y coordinate");
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    
    
  }
}  
