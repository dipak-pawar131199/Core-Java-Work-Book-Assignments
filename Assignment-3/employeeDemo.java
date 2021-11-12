import java.io.*;
class Employee
{
  private int id;
  private String name;
  private String dept;
  private double salary;
  double sal;
  Employee()
  {}
  Employee(int id,String name,String dept,double salary)
  {
     this.id=id;
     this.name=name;
     this.dept=dept;
     this.salary=salary;
     sal=salary;
  }
  void accept()throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter employee details:");
    System.out.println("Enter employee id: ");
    id=Integer.parseInt(br.readLine());
    System.out.println("Enter name of employee: ");
    name=br.readLine();
    System.out.println("Enter department of employee: ");
    dept=br.readLine();
    System.out.println("Enter salary of employee: ");
    salary=Double.parseDouble(br.readLine());
       
  }
  void display()
  {
    System.out.println("Employee id: "+id);
    System.out.println("Name of employee: "+name);
    System.out.println("Department of employee is: "+dept);
    System.out.println("Salary of employee: "+salary);
    
  }
}

class Manager extends Employee
{
  private double bonus;
  double totalsal;
  void accept()throws IOException
  {
    super.accept();  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter bonus employee getting:");
    bonus=Double.parseDouble(br.readLine());
  }
  void display()
  {
    System.out.println("---------------------------------------");
    super.display();
    System.out.println("Bonus employee get:"+bonus);
   // totalsalary=bonus+salary;
    System.out.println("Total Salary: "+total());    
  }
  public double total()
  {
     totalsal=bonus+super.sal;
     return totalsal;
   }
   

}

class employeeDemo
{
  public static void main(String args[])throws IOException
  {
   int i;
    Manager m[]=new Manager[2];
    
    for( i=0;i<2;i++)
    {
       m[i]=new Manager();
       m[i].accept();
       
    }
    System.out.println("Empolyee details:");
    for( i=0;i<2;i++)
       m[i].display();
    double max=m[0].totalsal;
    int x[]=new int[2];
    for(i=1;i<2;i++)
      {
         if(max<m[i].totalsal) 
         {
            max=m[i].totalsal;
            x[i]=i;
         }
      } 
      System.out.println("---------------------------------");
      System.out.println("  Employee haveing max salary  ");  
      for(i=0;i<x.length;i++)
      {
        m[x[i]].display();
      }
    
  }

}


