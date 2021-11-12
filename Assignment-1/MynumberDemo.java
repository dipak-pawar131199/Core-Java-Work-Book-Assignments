class MyNumber
{
  private int num;
  MyNumber()
  {}
  MyNumber(int num)
  {
    this.num=num;
  } 
  void isNegative()
  {
     if (num<0)
        System.out.println(num+" is Negative");
     else
        System.out.println(num+" is Non  Negative");
  }
  void isPositive()
  {
     if (num>0)
        System.out.println(num+" is Positive");
     else
        System.out.println(num+" is Non  Positive");
  }
  void isZero()
  {
     if (num==0)
        System.out.println(num+" is Zero");
     else
        System.out.println(num+" is Non  Zero");
  }
  void isEven()
  {
     if (num%2==0)
       System.out.println(num+"is Even");
     else
       System.out.println(num+"is  not Even");  
  }
  void isOdd()
  {
     if (num%2!=0)
       System.out.println(num+"is Odd");
     else
       System.out.println(num+"is not Odd");  
  }

}


class MynumberDemo
{
  public static void main(String args[])
  {
    MyNumber n=new MyNumber(Integer.parseInt(args[0]));
    n.isOdd();
    n.isEven();
    n.isNegative();
    n.isPositive();
    n.isZero();
  }
  
}  
  
