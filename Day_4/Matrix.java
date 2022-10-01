
public class Matrix 
{
	public static void main(String[] args) {  
        int rows, cols, sumrow, sumcol;  
          
        int a[][] = {     
                        {1, 2, 3},  
                        {4, 5, 6},  
                        {7, 8, 9}  
                    };  
            
        rows = a.length;  
        cols = a[0].length;  
 
           
        for(int i = 0; i < rows; i++){  
            sumrow = 0;  
            for(int j = 0; j < cols; j++){  
              sumrow = sumrow + a[i][j];  
            }  
            System.out.println("Sum of " + (i+1) +" row: " + sumrow);  
        }  
            
        for(int i = 0; i < cols; i++){  
            sumcol = 0;  
            for(int j = 0; j < rows; j++){  
              sumcol = sumcol + a[j][i];  
            }  
            System.out.println("Sum of " + (i+1) +" column: " + sumcol);  
        }  
    }  
}
