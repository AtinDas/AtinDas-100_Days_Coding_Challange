//import java.io.*;
import java.util.*;

public class Scanner_input
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Scanner sc = new Scanner(System.in);
        int c =1;
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            System.out.println(c+" "+s);
            c++;
        }
        sc.close();
    }
}
