import java.io.*;
abstract class Staff
{
  String name;
  String address;
   
  
}
class FullTimeStaff extends Staff
{
   String dept;
   double salary;
  public void accept()throws IOException
  {
         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
         System.out.println("Enter name of staff: ");
         name=br.readLine();
         System.out.println("Enter adderess of staff: ");
         address=br.readLine();
         System.out.println("Department: ");
         dept= br.readLine();
         System.out.println("Salary of staff: ");
         salary=Integer.parseInt(br.readLine());

  }
  
  void display()
  {
    System.out.println("-----------------------------------");
    System.out.println("Name of Staff: "+name);
    System.out.println("Address: "+address);
    System.out.println("Department : "+dept);
    System.out.println("Salary : "+salary);
    System.out.println("-----------------------------------");
  }     
}
class PartTimeStaff  extends Staff
{
   int no_of_hr;
   double rate_per_hr;
  public void accept()throws IOException
  {
           BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
         System.out.println("-----------------------------------");
         System.out.println("Enter name of staff: ");
         name=br.readLine();
         System.out.println("Enter adderess of staff: ");
         address=br.readLine();
         System.out.println("Enter number of hours: ");
         int numhr=Integer.parseInt(br.readLine());
         System.out.println("Enter rate per hour: ");
         double rphr=Double.parseDouble(br.readLine());
         System.out.println("-----------------------------------");
  } 
  void display()
  {
    System.out.println("Name of Staff: "+name);
    System.out.println("Address: "+address);
    System.out.println("Number of hour: "+no_of_hr);
    System.out.println("Rate per hour: "+rate_per_hr);
  }     
}
class StaffDemo
{
  public static void main(String args[])throws IOException
  {
     BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    // Staff s[];
     String name,add;
     FullTimeStaff f[]=null;
     int choice,n=0,m=0;
     do
     {
        System.out.println("Enter your choice: ");
        System.out.println("1)Full Time Staff");
        System.out.println("2)Part Time Staff");
        System.out.println("3)Exit");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
          case 1:
                  System.out.println("Enter the numbers of Full time taff: ");
                  
                   n=Integer.parseInt(br.readLine());
                  f=new FullTimeStaff[n];
                  for(int i=0;i<n;i++)
                   {
                      f[i]=new FullTimeStaff();//call default constructor
                      f[i].accept();   
                   }
                   for(int i=0;i<n;i++)
                      f[i].display(); 
                  break;
                  
          case 2: System.out.println("Enter the number of Part time staff:");
                  m=Integer.parseInt(br.readLine());
                  PartTimeStaff p[]=new PartTimeStaff[n]; 
                  for(int i=0;i<m;i++)
                  {
                    p[i].accept();
                  }
                  for(int i=0;i<n;i++)
                      p[i].display();
                  break;
          
           case 3:System.exit(0);              
        }
     }while(choice!=3);
  }
 }
