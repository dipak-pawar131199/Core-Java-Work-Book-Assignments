/*
Write a program to accept a string as command line argument and check whether it is a file or
directory. If it is a directory, list the contents of the directory, count how many files the
directory has and display name of all files in that directory having extension .txt. If it is a file,
display all information about the file (path, size, attributes etc).
*/

import java.io.*;

class FileDemo
{
  public static void main(String args[])
  {
     
     File f=new File(args[0]);
     if(f.isDirectory())
     {
       String s[]= f.list();
       System.out.println("Contents of Directory:"+s);
       for(int i=0;i<s.length;i++)
       {
          File f1=new File(s[i]);
          if(f1.isFile() && f1.getName().endsWith("text"))
          {
            System.out.println("Path of file: "+f1.getPath());
            System.out.println("Size of file: "+f1.length());
            
          }
         else if(f1.isDirectory())
          {
             String s1[]=f1.list();
             System.out.println(s1);
          }
       }      
      }
      else
        System.out.println("not directory");
     
  }
}
