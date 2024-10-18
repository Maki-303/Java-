package markjagonap;
import java.util.Scanner;
public class GradeConditionalSatement {
public static void main(String[] args) {
	
	try {
	Scanner s = new Scanner (System.in);
	
	
	System.out.println("Enter Your Grade in English: ");
	double englishGrade = s.nextDouble();
	System.out.println(" Enter Your Grade in Math: ");
	double mathGrade  = s.nextDouble();
	System.out.println("Enter Your Grade in Science: ");
	double scienceGrade  = s.nextDouble();
	System.out.println("Enter Your Grade in Filipino: ");
	double filipinoGrade  = s.nextDouble();	
	System.out.println("Enter Your Grade in P.E : ");
	double peGrade  = s.nextDouble();
	
	double average = (englishGrade+mathGrade+scienceGrade+filipinoGrade+peGrade ) / 5;
	
	
	// ENGLISH
	
	System.out.println("English: " + englishGrade);
	if (englishGrade >= 98 && englishGrade <= 100) {
		System.out.println("(1.00) Excellent");
	}
	else if (englishGrade >= 95 && englishGrade <= 97.99) {
	System.out.println("(1.5) Excellent");
	}
	else if (englishGrade >= 89 && englishGrade <=  91.99) {
	System.out.println("1.75 Good");
	}
	else if (englishGrade >= 86 && englishGrade <=  88.99) {
	System.out.println("2.00 Very Satisfactory");
	}
	else if (englishGrade >= 83 && englishGrade <=  85.99) {
	System.out.println("2.25 Satisfactory");
	}
	else if (englishGrade >= 80 && englishGrade <=  82.99) {
	System.out.println("2.25 Average");
	}
	else if (englishGrade >= 77 && englishGrade <=  79.99) {
	System.out.println("2.75 Fair");
	}
	else if (englishGrade >=75 && englishGrade <=  76.99) {
	System.out.println("3 Passed");
	}
	else if (englishGrade <=75) {
	System.out.println("3 Passed");
	}
	else {
	System.out.println("Invalid Grade");
	}
	
	// always add Space in between MATH

	System.out.println("Math : " + mathGrade);
	if (mathGrade >= 98 && mathGrade <= 100) {
		System.out.println("(1.00) Excellent");
	}
	else if (mathGrade >= 95 && mathGrade <= 97.99) {
	System.out.println("(1.5) Excellent");
	}
	else if (mathGrade >= 89 && mathGrade <=  91.99) {
	System.out.println("1.75 Good");
	}
	else if (mathGrade >= 86 && mathGrade <=  88.99) {
	System.out.println("2.00 Very Satisfactory");
	}
	else if (mathGrade >= 83 && mathGrade <=  85.99) {
	System.out.println("2.25 Satisfactory");
	}
	else if (mathGrade >= 80 && mathGrade <=  82.99) {
	System.out.println("2.25 Average");
	}
	else if (mathGrade >= 77 && mathGrade <=  79.99) {
	System.out.println("2.75 Fair");
	}
	else if (mathGrade >=75 && mathGrade <=  76.99) {
	System.out.println("3 Passed");
	}
	else if (mathGrade <=75) {
	System.out.println("3 Passed");
	}
	else {
	System.out.println("Invalid Grade");
	}
	
	// always add Space in between  SCIENCE
	
	System.out.println("Science : " + scienceGrade);
	if (scienceGrade >= 98 && scienceGrade <= 100) {
		System.out.println("(1.00) Excellent");
	}
	else if (scienceGrade >= 95 && scienceGrade <= 97.99) {
	System.out.println("(1.5) Excellent");
	}
	else if (scienceGrade >= 89 && scienceGrade <=  91.99) {
	System.out.println("1.75 Good");
	}
	else if (scienceGrade >= 86 && scienceGrade <=  88.99) {
	System.out.println("2.00 Very Satisfactory");
	}
	else if (scienceGrade >= 83 && scienceGrade <=  85.99) {
	System.out.println("2.25 Satisfactory");
	}
	else if (scienceGrade >= 80 && scienceGrade <=  82.99) {
	System.out.println("2.25 Average");
	}
	else if (scienceGrade >= 77 && scienceGrade  <=  79.99) {
	System.out.println("2.75 Fair");
	}
	else if (scienceGrade  >=75 && scienceGrade  <=  76.99) {
	System.out.println("3 Passed");
	}
	else if (scienceGrade  <=75) {
	System.out.println("3 Passed");
	}
	else {
	System.out.println("Invalid Grade");
	}
	
	// always add Space in between FILIPNO
	
	System.out.println("Filipino : " + filipinoGrade);
	if (filipinoGrade >= 98 && filipinoGrade <= 100) {
		System.out.println("(1.00) Excellent");
	}
	else if (filipinoGrade >= 95 && filipinoGrade <= 97.99) {
	System.out.println("(1.5) Excellent");
	}
	else if (filipinoGrade >= 89 && filipinoGrade <=  91.99) {
	System.out.println("1.75 Good");
	}
	else if (filipinoGrade >= 86 && filipinoGrade <=  88.99) {
	System.out.println("2.00 Very Satisfactory");
	}
	else if (filipinoGrade >= 83 &&filipinoGrade <=  85.99) {
	System.out.println("2.25 Satisfactory");
	}
	else if (filipinoGrade >= 80 && filipinoGrade <=  82.99) {
	System.out.println("2.25 Average");
	}
	else if (filipinoGrade >= 77 && filipinoGrade <=  79.99) {
	System.out.println("2.75 Fair");
	}
	else if (filipinoGrade >=75 && filipinoGrade <=  76.99) {
	System.out.println("3 Passed");
	}
	else if (filipinoGrade <=75) {
	System.out.println("3 Passed");
	}
	else {
	System.out.println("Invalid Grade");
	}
	
	
	// always add Space in between PE
	
	System.out.println("PE : " + peGrade);
	if (peGrade >= 98 && peGrade <= 100) {
		System.out.println("(1.00) Excellent");
	}
	else if (peGrade >= 95 && peGrade <= 97.99) {
	System.out.println("(1.5) Excellent");
	}
	else if (peGrade  >= 89 && peGrade <=  91.99) {
	System.out.println("1.75 Good");
	}
	else if (peGrade >= 86 && peGrade <=  88.99) {
	System.out.println("2.00 Very Satisfactory");
	}
	else if (peGrade >= 83 && peGrade <=  85.99) {
	System.out.println("2.25 Satisfactory");
	}
	else if (peGrade >= 80 && peGrade <=  82.99) {
	System.out.println("2.25 Average");
	}
	else if (peGrade >= 77 && peGrade <=  79.99) {
	System.out.println("2.75 Fair");
	}
	else if (peGrade >=75 && peGrade <=  76.99) {
	System.out.println("3 Passed");
	}
	else if (peGrade <=75) {
	System.out.println("3 Passed");
	}
	else {
	System.out.println("Invalid Grade");
	}
	
	
	// Always add space in between  AVERAGE 

	System.out.println("Average :" + average);
	if (average >= 98 && average <= 100) {
		System.out.println("(1.00) Excellent");
	}
	else if (average >= 95 && average <= 97.99) {
	System.out.println("(1.5) Excellent");
	}
	else if (average  >= 89 && average  <=  91.99) {
	System.out.println("1.75 Good");
	}
	else if (average  >= 86 && average  <=  88.99) {
	System.out.println("2.00 Very Satisfactory");
	}
	else if (peGrade >= 83 && average  <=  85.99) {
	System.out.println("2.25 Satisfactory");
	}
	else if (peGrade >= 80 && average  <=  82.99) {
	System.out.println("2.25 Average");
	}
	else if (average  >= 77 && average  <=  79.99) {
	System.out.println("2.75 Fair");
	}
	else if (average  >=75 && average  <=  76.99) {
	System.out.println("3 Passed");
	}
	else if (average  <=75) {
	System.out.println("3 Passed");
	}
	else {
	System.out.println("Invalid Grade");
	}
	
	
	
	}catch(Exception e ) {
		System.out.println("Please Input Number only");
	}

}}
