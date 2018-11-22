import java.util.Scanner; //To import utility files for Scanner
class AddTwoInt
{
  public static void main(String a[])
  {
    Scanner sc=new Scanner(System.in); //To get keyboard input
    System.out.println("Enter only integer values");
    System.out.println("Enter First number");
    int num1=sc.nextInt(); //To assign first keyboard input
    System.out.println("Enter Second number");
    int num2=sc.nextInt(); //To assign second keyboard input
    while(num2 != 0)
    {
    int temp=num1&num2; //Binary and operation is applied
    num1=num1^num2; //XOR is applied
    num2=temp<<1; //Binary shift is applied
    }
    System.out.println("Added value is : "+num1);
    System.out.println("This is the end of the program");
  }
}