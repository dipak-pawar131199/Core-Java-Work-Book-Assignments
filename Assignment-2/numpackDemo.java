import NumOperation.*;
import java.io.*;
class numpackDemo 
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the number: ");
    int num=Integer.parseInt(br.readLine());
    int choice;
    do
    {
      System.out.print("Enter your choice: ");
      
      
      System.out.println("1)To Check Number Is Prime or not");
      System.out.println("2)To Check Number Is Perfect or not");
      System.out.println("3)To Check Number Is Armstrong or not");
      System.out.println("4)Exit");
      
      choice=Integer.parseInt(br.readLine());
      
      switch(choice)
      {
         case 1: PrimeNum pn=new PrimeNum(num);    
                 if(pn.isPrime())
                 {
                   System.out.println(num+"is Prime");
                   break;
                 }    
		 else
		   System.out.println(num+"is Not Prime");
                   break;
        case 2:Perfect p=new Perfect(num);
	       if(p.isPerfect())
	       { 
	          System.out.println(num+"is Perfect");  
	          break;
	       }  
	       else
	         System.out.println(num+"is Not Perfect");
                 break;  
       case 3:Armstrong a=new Armstrong(num);
              if(a.isArmstrong())
              {
                 System.out.println(num+"is Armstrong");
                 break;
              }
             else
                System.out.println(num+"is Not Armstrong");
                break;
       case 4:System.exit(0);          
     }  
       
    }while(choice!=4);
    
    
   
   
        
          
  }
}
