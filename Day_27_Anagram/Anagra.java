import java.util.Scanner;

public class Anagra {

    static boolean isAnagram(String a, String b) 
    {
      a = a.toLowerCase();
      b = b.toLowerCase();
      
      boolean isVisited[] = new boolean[b.length()];
      boolean isAnagram = false;

      if(a.length() == b.length())
      {
        for(int i = 0; i<a.length(); i++)
        {
          char c = a.charAt(i);
          isAnagram = false;

          for(int j=0; j<b.length(); j++)
          {
            if(c == b.charAt(j) && !isVisited[j])
            {
              isAnagram = true;
              isVisited[j] = true;
              break;
            }
          }
          if(!isAnagram)
          {
            break;
          }
          }
          if(isAnagram)
          {
            return true;
          }
          else 
          {
            return false;
          }
      }
      return false; 
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}