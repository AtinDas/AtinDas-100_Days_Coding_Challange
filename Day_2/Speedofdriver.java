import java.util.Scanner;
public class Speedofdriver 
{
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
        System.out.print("Enter speed: ");
		int speed = in.nextInt();
		float speed1=0;
		
		if (speed <= 70)
			System.out.println("OK");

	    else
	        speed1 = ((speed-70)/5); 
		
		{
	        if (speed1 <= 12)
	        	System.out.println("Point: " + speed1);

	        else
	        	System.out.println("License suspended");
		}
		in.close();
	}
}
