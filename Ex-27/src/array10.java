public class array10 {
   public static void main(String[] args) {
      final int[][] matrix = {
         { 1 ,2,3,4 },
         { 5,6,7,8},
         { 9,10,11,12},
         { 13,14,15,16}
         
      };
      for (int i = 0; i < matrix.length; i++) { 
         for (int j = 0; j < matrix[i].length; j++) { 
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println(); 
      }
   }
}