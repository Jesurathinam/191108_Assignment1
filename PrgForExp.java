class PrgForExp
{
  public static void main(String x[])
  {
  int a=20, b=10;
  System.out.println("Value of a is "+a+" and Value of b is : "+b);
  b=a-- - --a;
  System.out.println("a-- - --a value calculated and stored in b, and the value of b is : "+b);
  int c=a--;
  System.out.println("a-- assigned to c and the value of c is : "+c);
  int d=a>>2;
  System.out.println("a>>2 value calculated and stored in d, and the value of d is : "+d);
  int e=a&b;
  System.out.println("a&b value calculated and stored in e, and the value of e is : "+e);
  System.out.println("This is the end of the program");
  }
}