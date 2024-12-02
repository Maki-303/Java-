package Math;
import java.util.Scanner;
public class Mathematics {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter a Number Start: ");
		        int start = scanner.nextInt();
		        
		        System.out.print("Enter a Number End: ");
		        int end = scanner.nextInt();

		        
		        if (start < 1 || start > 11 || end < 1 || end > 11) {
		            System.out.println("Please enter both start and end numbers between 1 and 11.");
		            return; 
		        }

		        
		        System.out.print("Select Divisible by [2][3][4][5][6][7][8][9]: ");
		        int divisor = scanner.nextInt();

		        System.out.print("The numbers divisible by " + divisor + " between " + start + " and " + end + " are: ");

		       
		        int number = start;
		        boolean found = false;

		 
		        while (number <= end) {
		            if (number % divisor == 0) {
		                if (found) {
		                    System.out.print(", ");
		                }
		                System.out.print(number);
		                found = true;
		            }
		            number++;
		        }

		    
		        if (!found) {
		            System.out.print("None");
		        }

		        System.out.println(); 
		        scanner.close();
		    }
		


	}


