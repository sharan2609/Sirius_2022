import java.util.Scanner;

public class daysinmonth21 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int month;
		sc = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		month = sc.nextInt();	
		switch(month)
		{
		  	case 1:
		  	case 3:
			case 5: 	
			case 7:
			case 8:
			case 10:
			case 12:			  	
				System.out.println("\n 31 Days in this Month");
			  	break;
			
			case 4:	
			case 6:
			case 9:
			case 11:			    	
				System.out.println("\n 30 Days in this Month");  
				break;
			
			case 2:
			    int year;
                System.out.println("Enter an Year :: ");
                year = sc.nextInt();

                if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                 System.out.println("29 days in this month");
                else
                 System.out.println("28 days in this month");
				break;
			
			    default:		  	
				System.out.println("\n enter Valid Number ");
		  }
	}
}