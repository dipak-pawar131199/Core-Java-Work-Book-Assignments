import java.io.*;

class student
{
   int rno;
   String name;
   double per;
   student()
   {}
   student(int rno,String name,double per)
   {
      this.rno=rno;
      this.name=name;
      this.per=per;
   }
   void display()
   {
     System.out.println("Student Roll No.: "+rno);
     System.out.println("Student name: "+name);
     System.out.println("Student per: "+per);
   }
}

class studentDemo
{
   public static void StudentSort(student s[])
   {
      int i,j ,temp1;
      String temp2;
      double temp3;
      
      for(i=0;i<s.length-1;i++)
      {
        for(j=0;j<s.length-1;j++)
        {
           if(s[j].per<s[j+1].per)
           {
             temp1=s[j].rno;
             s[j].rno=s[j+1].rno;
             s[j+1].rno=temp1;
             
             temp2=s[j].name;
             s[j].name=s[j+1].name;
             s[j+1].name=temp2;
             
             temp3=s[j].per;
             s[j].per=s[j+1].per;
             s[j+1].per=temp3;
             
             
           }
        }
      }
     System.out.println("---------------------------------------");     
     System.out.println("After sorting");
     System.out.println("---------------------------------------");
     for(i=0;i<s.length;i++)
       s[i].display();
     System.out.println("---------------------------------------");
     
   }
   public static void main(String args[])throws IOException
   {
     int rno;
     String name;
     double per;
     int i;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("How many student?");
     int n=Integer.parseInt(br.readLine());
     student s[]=new student[n];
     System.out.println("Enter student details: ");
     for(i=0;i<n;i++)
     {
        System.out.println("Enter  The Roll No. Of Student: ");
        rno=Integer.parseInt(br.readLine());
        System.out.println("Enter The Name Of Student: ");
        name=br.readLine();
        System.out.println("Enter The Percentage Of Student: ");
        per=Double.parseDouble(br.readLine()); 
        s[i]=new student(rno,name,per); 
     }
     System.out.println("---------------------------------------");
     System.out.println("Before sorting");
     System.out.println("---------------------------------------");
     for(i=0;i<n;i++)
       s[i].display();
     System.out.println("---------------------------------------");
     StudentSort(s);  
     
       
   }
  } 

