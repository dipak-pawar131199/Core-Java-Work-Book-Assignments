import MScCAI.*;
import MScCAII.*;
import java.io.*;
class Student
{
  int rollno,total;
  String name,grade;
  double per; 
  Student(int rno,String name)
  {
    rollno=rno;
    this.name=name;
    //new MScCAIIMarks(semITotal,semIITotal);
  }
}

class studentDemo
{
  public static void main(String args[])throws IOException
  {
    int i,j;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("how many students?");
    int n=Integer.parseInt(br.readLine());
    MScCAIMarks c1[]=new MScCAIMarks[n];
    MScCAIIMarks c2[]=new MScCAIIMarks[n];
    Student s[]=new Student[n];
    String name;
    int rno;
    //int total;
   // double per;
    int sem1totalc1,sem2totalc1,sem1totalc2,sem2totalc2;
    for(i=0;i<n;i++)
    {
       System.out.println("Enter name of student "+(i+1)+" : ");
       name=br.readLine();
       System.out.println("Enter Roll No of student: ");
       rno=Integer.parseInt(br.readLine());
       System.out.println("Enter sem one total marks for CAI Out of 300: ");
       sem1totalc1=Integer.parseInt(br.readLine());
       System.out.println("Enter sem two total marks for CAI Out of 300: ");
       sem2totalc1=Integer.parseInt(br.readLine());
       System.out.println("Enter sem one total marks for CAII Out of 300: ");
       sem1totalc2=Integer.parseInt(br.readLine());
       System.out.println("Enter sem two total marks for CAII Out of 300: ");
       sem2totalc2=Integer.parseInt(br.readLine());

       s[i]=new Student(rno,name);
       c1[i]=new MScCAIMarks(sem1totalc1,sem1totalc1);
       c2[i]=new MScCAIIMarks(sem1totalc2,sem1totalc2);
       
         
    }
    
    
   for(i=0;i<n;i++)
    {
       s[i].total=c1[i].semITotal+c1[i].semIITotal+c2[i].semITotal+c2[i].semIITotal;
        s[i].per=(double)(s[i].total*100)/1200;
        if(s[i].per>=70)
           s[i].grade="A";
        else if(s[i].per>=60 && s[i].per<70)
            s[i].grade="B";
        else if(s[i].per>=50 && s[i].per<60)
            s[i].grade="C";
        else if(s[i].per>=40 && s[i].per<50)
            s[i].grade="Pass";
        else
             s[i].grade="Fail";
    }
  
  for(i=0;i<n;i++)
  {
    System.out.println("----------------------------------");
    System.out.println("|------------| Result |----------|");
    System.out.println("----------------------------------");
    
    System.out.println("Name of Student: "+s[i].name);
    System.out.println("Roll No.: "+s[i].rollno);
    System.out.println("MScCAI and MScCAII Total: "+s[i].total);
    System.out.println("Percentage : "+s[i].per);
    System.out.println("Grade : "+s[i].grade);
    System.out.println("----------------------------------");
  }
  }
  }

