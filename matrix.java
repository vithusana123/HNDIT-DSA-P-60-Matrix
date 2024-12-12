package matrix;
public class matrix {
 public static void main(String[] args) {
     int[][] matrix = {
         {1, 2, 3},
         {4, 5, 6}
     };
     int maxElement = findMax(matrix);
     System.out.println(maxElement);
 }
 public static int findMax(int[][] matrix) {
     int max = Integer.MIN_VALUE; 

     for (int[] row : matrix) { 
         for (int element : row) { 
             if (element > max) { 
            	 max = element;
             }
         }
     }

     return max; 
 }
}

