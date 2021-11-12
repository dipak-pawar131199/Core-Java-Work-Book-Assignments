package NumOperation;
public class Perfect
{
  int num;
  public Perfect(int num)
  {
    this.num=num;
  }
  public boolean isPerfect()
  {
     int n=num;
     int sum=0,i=1;
      while(i<num)
      {
         if(num%i==0)
         {
           sum+=i;
         }
         i++;
      }
      if (n==sum)
      {
        return true;
      }
      else
       return false;
  }  
}
