//The program is to use loops to help us do some simple math.
//Given an integer, N , print its first 10 multiples.
//Each multiple N x i (where 1<=i<=10 ) should be printed on a new line in the form: N x i = result.


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }
    }
}
