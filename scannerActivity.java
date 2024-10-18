package markjagonap;
import java.util.Scanner;
public class scannerActivity {

	public static void main(String[] args) {
		try { 
			Scanner maki = new Scanner (System.in); 
		System.out.println("Enter item 1:"); 
		String item1 = maki.nextLine();
		System.out.println("Enter price for " + item1 + ":"); 
		float price1 = maki.nextFloat(); 
		System.out.println("Enter quantity for " + item1 + ":"); 
		int quantity1 = maki.nextInt();
		float product1 = price1 * quantity1;
		
		Scanner mark = new Scanner (System.in); 
		System.out.println("Enter enter item2:"); 
		String item2 = mark.nextLine(); 
		System.out.println("Enter price for " + item2 + ":"); 
		float price2 = mark.nextFloat(); 
		System.out.println("Enter quantity for " + item2 + ":"); 
		int quantity2 = mark.nextInt(); 
		float product2 = price2 * quantity2; 
		
		System.out.println (item1 + "................Php " + price1 + " X " + quantity1 + " = " + product1);
		System.out.println (item2 + "................Php " + price2 + " X " + quantity2 + " = " + product2); 
		float total = product1 + product2; System.out.println ("Total Amount is: " + total); 
		System.out.println ("-------------------------------------\r\n" +"          Thank You        "); 
		
		

	}catch ( Exception e) {System.out.println("invalid"); 

}}}
