
import java.util.Scanner;
public class Main
{
    public static void display() // funcation
    {
        System.out.println(" Calculator "); //System.out.println = cout<<""
        System.out.println(" 1. Sum ");
        System.out.println(" 2. Subtraction ");
        System.out.println(" 3. Multiply ");
        System.out.println(" 4. Modulus  "); 
        System.out.println(" 5. Divide  ");     
    } //static function call the static function
    public static int sum(int a,int b)
    {
      return a+b;
    }
    public static int sub(int a,int b)
    {
      return a-b;
    }
    public static int mul(int a,int b)
    {
      return a*b;
    }
    public static int div(int a,int b)
    {
      return a/b;
    }
    public static int mol(int a,int b)
    {
      return a%b;
    }
    public static void main(String args[])
    {
      int a,b;
      int choice;
      while(true)
      {
        display();
        System.out.print("Enter the Choice : ");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt(); //cin>>choice
        switch(choice)
        {
            case 1:
            {
                //Part of Sum
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                System.out.println("Sum is " + sum(a,b));
                break;
            }
            case 2:
            {
               //Part of Subtract
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                System.out.println("Subtract is " + sub(a,b));
                break;
            }
            case 3:
            {
               //Part of Multipelation
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                System.out.println("Multiply is " + mul(a,b));
                break;
            }
            case 4:
            {
               //Modules
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                System.out.println("Modulas " + mol(a,b));
                break;
            }
            case 5:
            {
               //Dividision 
                System.out.print("Enter the 1st Number : ");
                a = s.nextInt(); 
                System.out.print("Enter the 2nd Number : ");
                b = s.nextInt();
                System.out.println("Divide " + div(a,b));
                break;
            }
           default:
             System.out.println("Error ! ");
              break;
            
        }
      }
        
    }
    
}
