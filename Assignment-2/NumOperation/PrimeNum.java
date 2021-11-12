package NumOperation;

 public class PrimeNum
 {
   int n;
   public PrimeNum()
   {}
   public PrimeNum(int num)
   {
     n=num;
   }
   public boolean isPrime()
   {
     int i=2;
     while(i<=n/2)
     {
       if(n%i==0)
        {
          return false;
        }
        else
           i++;   
     }
     return true;
   }
 }
