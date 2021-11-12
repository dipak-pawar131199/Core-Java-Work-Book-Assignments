package NumOperation ;
import java.lang.Math.*;
public class Armstrong
{
   int count=0;
   int num;
   public Armstrong()
   {}
   public Armstrong(int num)
   {
      this.num=num;
   }
   public int countdigit(int num)
   {
      while(num>0)
      {
         count++;
           num/=10;
      }
      return count;
    }
    public boolean isArmstrong()
    {
      int n=num; 
      int c=countdigit(n);
      int sum=0;
      while (n>0)
      {
         int lastdigit=n%10;
         sum+=Math.pow(lastdigit,c);
         n=n/10; 
      }
      if(sum==num)
         return true;
      else
         return false;   
    }
}

