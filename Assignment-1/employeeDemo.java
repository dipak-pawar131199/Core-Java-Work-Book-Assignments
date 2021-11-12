import java.io.*;
class Empolyee
{
  static int count;
  String name;
  String position;
  double salary;
  Empolyee()
  {}
  Empolyee(String name,String position,double salary)
  {
      this.name=name;
      this.position=position;
      this.salary=salary;
   
  }
  static void counter()
  {
    count ++;
    System.out.println("object no:"+count);
  }
 public String toString()
  {
     String result="Empolyee name: "+name+"\n Empolyee Position: "+position+"\nEmpolyee Salary: "+salary;
     return result;
      
  }
  void display()
  {
    System.out.println("Name of employee"+name);
    System.out.println("Position of employee"+position);
    System.out.println("Salary of employee"+salary);
  }

}
class employeeDemo
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("How many Empolyees: ");
    int n=Integer.parseInt(br.readLine());
    int i;
    Empolyee e[]=new Empolyee[n];
    for(i=0;i<n;i++)
    {
      System.out.print("Enter name of empolyee: ");
      String name=br.readLine();
      System.out.print("Enter Position of empolyee: ");
      String position=br.readLine();
      System.out.print("Enter Salary of empolyee: ");
      double sal=Double.parseDouble(br.readLine());
      e[i]=new Empolyee(name,position,sal);
      e[i].counter();
    }

  
  System.out.println("Empolyee Details: ");
  for(i=0;i<n;i++)
   {  
     System.out.print(e[i].toString());     
   }
  }
}
