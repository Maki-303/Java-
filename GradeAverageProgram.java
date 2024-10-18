package markjagonap;
import java.util.Scanner;
public class GradeAverageProgram {
public static void main(String[] args) {
	
	Scanner s = new Scanner (System.in);
	
	
	System.out.println("English        : ");
	float englishGrade = s.nextFloat();
	System.out.println("Math           : ");
	float mathGrade  = s.nextFloat();
	System.out.println("Science        : ");
	float scienceGrade  = s.nextFloat();
	System.out.println("Filipino       : ");
	float filipinoGrade  = s.nextFloat();
	System.out.println("P.E            : ");
	float peGrade  = s.nextFloat();
	System.out.println("=Comprog        : ");
	float comprogGrade = s.nextFloat();
	System.out.println("ComprogLab        : ");
	float comproglabGrade = s.nextFloat();
	System.out.println("Intro Lab        : ");
	float introcomputingGrade = s.nextFloat();
	System.out.println("IntroComputing        : ");
	float discreteGrade = s.nextFloat();
	System.out.println("Discrete        : ");
	float introcomputinglabGrade = s.nextFloat();
	System.out.println("Physics        : ");
	float physicsGrade = s.nextFloat();

	float average = (englishGrade +  mathGrade + scienceGrade + filipinoGrade + peGrade + comprogGrade
	+ comproglabGrade + introcomputingGrade + discreteGrade + introcomputinglabGrade + physicsGrade) / 11;
	System.out.println();
	System.out.println("Average : " + average);
	
	if (average > 100) System.out.println("Invalid Grade");
	else if (average >= 100 ) System.out.println("1:00 Excellent");
	else if (average >= 97.99) System.out.println("1.25 Superior");
	else if (average >= 94.99) System.out.println("1.50 Very Good");
	else if (average >= 91.99) System.out.println("1.75 Good");
	else if (average >= 88.99) System.out.println("2.00 Very Satisfactory");
	else if (average >= 85.99) System.out.println("2.25 Satisfactory");
	else if (average >= 82.99) System.out.println("2.50 Average");
	else if (average >= 79.99) System.out.println("2.75 Fair");
	else if (average >= 76.99) System.out.println("5.00 Failed");
	else if (average >= 75) System.out.println("5.00 Failed");
	
	
	
	}

}
