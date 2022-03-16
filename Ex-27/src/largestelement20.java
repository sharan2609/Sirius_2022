public class largestelement20{
 
	public static void maxelement(int no_of_rows, int[][] arr) 
	{
        int i = 0;
        int max = 0;
        int[] result = new int[no_of_rows];
        while (i < no_of_rows) {
        for (int j = 0; j < arr[i].length; j++) 
        {
          if (arr[i][j] > max) {
            max = arr[i][j];

          }
            }

            result[i] = max;
            max =0;
            i++;
       }
       
        printArray(result);
    }

    private static void printArray(int[] result) {

        for (int i =0; i<result.length;i++) {

            System.out.println(result[i]);

        }
    }
    public static void main(String[] args) {

        int[][] arr = new int[][] { {1,2,3,4},

                                    {5,6,7,8},

                                    {9,10,11,12},

                                   {13,14,15,16} };

        maxelement(4, arr);

    }
}