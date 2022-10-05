import java.util.Scanner;
public class Divisibility 
{
	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = in.nextInt();
                  
            if (i%15==0)                                                
                System.out.println("FizzBuzz");
            
            else if (i%5==0)    
                System.out.println("Buzz");
 
            
            else if (i%3==0)    
                System.out.println("Fizz");
                 
            else 
                System.out.println("number" + i + "is not divisible by 3 or 5");                        
               
        in.close();
    }
}
