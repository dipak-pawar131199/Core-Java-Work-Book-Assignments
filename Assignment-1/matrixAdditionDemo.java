import java.io.*;

class matrixAdditionDemo
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,j;
    System.out.println("how many rows of first matrix?");
    int nrow1=Integer.parseInt(br.readLine());
    System.out.println("how many columns of first matrix?");
    int ncol1=Integer.parseInt(br.readLine());
    
   int a[][]=new int[nrow1][ncol1];
    System.out.println("Enter elements of first Matrix:");
    for(i=0;i<nrow1;i++)
    {
      for(j=0;j<ncol1;j++)
      {
         
         a[i][j]=Integer.parseInt(br.readLine());
      }
      
    }
    
    System.out.println("how many rows of second matrix?");
    int nrow2=Integer.parseInt(br.readLine());
    System.out.println("how many columns of second matrix?");
    int ncol2=Integer.parseInt(br.readLine());
    
     int b[][]=new int[nrow2][ncol2];
    System.out.println("Enter elements of first Matrix:");
    for(i=0;i<nrow2;i++)
    {
      for(j=0;j<ncol2;j++)
      {
        

          b[i][j]=Integer.parseInt(br.readLine());
      }
    }
    //display matrix
    System.out.println("Elements of first matrix:");
    for(i=0;i<nrow1;i++)
    {
      for(j=0;j<ncol1;j++)
      {
        System.out.print(a[i][j]+" ");
        
      }
    System.out.println();
   }
    System.out.println("Elements of second matrix:");
    for(i=0;i<nrow2;i++)
    {
      for(j=0;j<ncol2;j++)
      {
        System.out.print(b[i][j]+" ");
        
      }
    System.out.println();
   }
  //addition of 2 matrix
   if(nrow1==ncol2)
   {
     int c[][]=new int[nrow1][ncol2];
      for(i=0;i<nrow1;i++)
      {
        for(j=0;j<ncol2;j++)
        {
          c[i][j]=a[i][j]+b[i][j];
        }
      }
      //display result
      
    System.out.println("---------------------------------------------");
    System.out.println("Addition of 2 matrix is:");
    System.out.println("---------------------------------------------");         
    for(i=0;i<nrow2;i++)
    {
      for(j=0;j<ncol2;j++)
      {
        System.out.print(c[i][j]+" ");
        
      }
    System.out.println();
   }
   
   } 
   }
 }
