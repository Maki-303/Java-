package markjagonap;
import java.util.Scanner;
public class switch2 {
public static void main(String[] args) {
		try {
  Scanner s = new Scanner(System.in);

    System.out.print("Month: ");
    int month = s.nextInt();
    System.out.print("Date: ");
    int date = s.nextInt();
    System.out.print("Year: ");
    int year = s.nextInt();

    if (month < 1 || month > 12 || date < 1 || date > 31) {
        System.out.println("Invalid Month or Day");
        return;
    }
    
    String monthName = "";
    String holiday = "";
    
    switch (month) {
        case 1:
            monthName = "January";
            if (date == 1) holiday = "New Year's Day";
            break;
        case 2:
            monthName = "February";
            if (date == 10) holiday = "Chinese New Year";
            break;
        case 3:
            monthName = "March";
            if (date == 28) holiday = "Maundy Thursday";
            else if (date == 29) holiday = "Good Friday";
            else if (date == 30) holiday = "Black Saturday";
            break;
        case 4:
            monthName = "April";
            if (date == 9) holiday = "Day of Valor";
            else if (date == 10) holiday = "Eidul Fitr";
            break;
        case 5:
            monthName = "May";
            if (date == 1) holiday = "Labor Day";
            break;
        case 6:
            monthName = "June";
            if (date == 12) holiday = "Independence Day";
            else if (date == 16) holiday = "Eidul Adha";
            break;
        case 8:
            monthName = "August";
            if (date == 21) holiday = "Ninoy Aquino Day";
            else if (date == 26) holiday = "National Heroes Day";
            break;
        case 11:
            monthName = "November";
            if (date == 1) holiday = "All Saints' Day";
            else if (date == 2) holiday = "All Souls' Day";
            else if (date == 30) holiday = "Bonifacio Day";
            break;
        case 12:
            monthName = "December";
            if (date == 8) holiday = "Immaculate Conception";
            else if (date == 24) holiday = "Christmas Holiday";
            else if (date == 25) holiday = "Christmas Day";
            else if (date == 30) holiday = "Rizal Day";
            else if (date == 31) holiday = "New Year's Eve";
            break;
        default:
            break;
    }

    if (monthName != "") {
        System.out.print(monthName + " " + date + ", " + year);
        if (holiday != "") {
            System.out.println(" (" + holiday + ")");
        } else {
            System.out.println();
        }
    } else {
        System.out.println("Invalid Month or Day");
    }
    
    

	}catch (Exception e) {
		System.out.println("mali na enter mo boss");
	}

}}
