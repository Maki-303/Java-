package maki;
import java.util.Scanner;
public class dateFormatter {
public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("Month  : ");
	int month = s.nextInt();
	System.out.println("Day    : ");
	int day = s.nextInt();
	System.out.println("Year   : ");
	int year = s.nextInt();
	
	
	  if (month < 1 || month >12 ) {
		System.out.println("Invalid Month or Day");
		return;
	}
	  if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
		   System.out.println("Invalid month or day");
		   return;
	}
	  if (month == 2) {
		  if (day < 1 || day > 29) {
		  System.out.println("Invalid month or day");
		  return;
		  }
	  if (day == 29 && ! isLeapYear (year)) {
		  System.out.println ("Invalid Month or day");
	  }
	  
	  }
	  if (day < 1  || day > 31 ) {
		  System.out.println ("Invalid Month Or day");
		 return;
	  }
	  
	  String monthname = "";
	  switch (month) {
	                 case 1 : monthname = "January"; break;
	                 case 2 : monthname = "January"; break;
	                 case 3 : monthname = "January"; break;
	                 case 4 : monthname = "January"; break;
	                 case 5 : monthname = "January"; break;
	                 case 6 : monthname = "January"; break;
	                 case 7 : monthname = "January"; break;
	                 case 8 : monthname = "January"; break;
	                 case 9 : monthname = "January"; break;
	                 case 10: monthname = "January"; break;
	                 case 11: monthname = "January"; break;
	                 case 12: monthname = "January"; break;
	  }   
	  
	   String occasion = "";  
	   switch (month) { 
	   					case 1 :
	   						if (day == 1) occasion = "New Year's Day"; 
	   						                  break;
	   					case 2 :
	   						if (day == 1) occasion = "Chinese New Year"; 
	   						else if (day == 14 )  occasion = "Valentines Day"; 
	   						                  break;
	   					case 3 :
	   						if (day == 28) occasion = "Maundy Thursday"; 
	   						else if (day == 29) occasion = " Good Friday";
	   						else if (day == 30) occasion = "black Staurday"; 
	   						else if (day == 9) occasion = " Day of Valor"; 
	   						                  break;
	   					case 4 :
	   						if (day == 10) occasion ="Eidul fitr"; 
	   						                  break;
	   					case 5 :
	   						if (day == 1) occasion = ""; 
	   						                  break;
	   						
	   					case 6 :
	   						if (day == 1) occasion = ""; break;
	   					case 8 :
	   						if (day == 1) occasion = ""; break;
	   					case 11:
	   						if (day == 1) occasion = ""; break;
	   					case 12:
	   						if (day == 1) occasion = ""; break;
	   					
	   		
	             
	  }
			  

	} //catch  

}

// public static void boolean isLeapYear (int year) {
//	 return (year & 4 == 0 && year % 100!=0) || (year % == -0);
// }

