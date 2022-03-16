import java.util.Scanner;
class searchelement16
{
   public static void main(String args[])
   {
      int counter, num, item, count=0,  array[];
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt(); 
      array = new int[num]; 
      System.out.println("Enter " + num + " integers");
      for (counter = 0; counter < num; counter++)
        array[counter] = input.nextInt();
      System.out.println("Enter the search value:");
      item = input.nextInt();

      for (counter = 0; counter < num; counter++)
      {
         if (array[counter] == item) 
         {
           System.out.println(item+" is present at location "+(counter+1));
           break;
         }
      }
      if (counter == num)
        System.out.println(item + " doesn't exist in array.");
    
      for (counter=0; counter<num; counter++)
      {
    	  if(array[counter]==item)
    	  {
    		  count=count+0;
    		  count++;
    	  }
    	  System.out.println("The count is" +count);
        }
      }
   }
   
   
