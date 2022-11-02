import java.io.*;
import java.util.regex.*;
import java.util.Scanner;

public class Regex
{
	public static void main(String[] args)
  {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0)
    {
			String pattern = in.nextLine();
          	//Write your code
            testCases--;
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }
		}
	}
}