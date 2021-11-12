abstract class Shape
{
 
   abstract void cal_area();
   abstract void cal_volume();
}

//derive a class Sphere from Shape
class Sphere extends Shape
{
  int radius;
  Sphere (int radius)
  {
    this.radius=radius;
  }
  void cal_area()
  {
     double area=4*3.14*radius*radius;
     System.out.println("Area of Sphere: "+area); 
  }  
  void cal_volume()
  {
    double volume=(4/3)*3.14*radius*radius*radius;
    System.out.println("Volume of Sphere: "+volume);
  }  
}
//derive class Cone from Shape

class Cone extends Shape
{
  int radius,height;
  Cone(int radius,int height)
  {
    this.radius=radius;
    this.height=height;
  }
 void cal_area()
  {
     double area=3.14*radius*radius;
     System.out.println("Area of Cone: "+area); 
  }  
  void cal_volume()
  {
    double volume=3.14*radius*radius*height*height*height;
    System.out.println("Volume of Cone: "+volume);
  }  
}



class AbstracShape
{
  public static void main(String args[])
  {
     Shape s;
     s=new Sphere(4);
     s.cal_area();
     s.cal_volume();
   
 } 
}
