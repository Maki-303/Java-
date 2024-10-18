package markjagonap;
import java.util.Scanner;
public class StudentGrades {
public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
			String Studentnames [] = new String [2];
			int Grades [] = new int [6];
			
			System.out.println ("Enter Student Name1: ");
			Studentnames [0] = s.nextLine();
			System.out.println ("Enter Student Name2: ");
			Studentnames [1] = s.nextLine();
			
			System.out.println ("Enter " + Studentnames [0] + " Grade in English: ");
			Grades [0] = s.nextInt();
			System.out.println ("Enter " + Studentnames [1] + " Grade in English: ");
			Grades [1] = s.nextInt();
			System.out.println ("Enter " + Studentnames [0] + " Grade in Math: ");
			Grades [2] = s.nextInt();
			System.out.println ("Enter " + Studentnames [1] + " Grade in Math: ");
			Grades [3] = s.nextInt();
			System.out.println ("Enter " + Studentnames [0] + " Grade in Computer Programming: ");
			Grades [4] = s.nextInt();
			System.out.println ("Enter " + Studentnames [1] + " Grade in Computer Programming: ");
			Grades [5] = s.nextInt();
			
			System.out.println("______________________________________\r\n"
					+ "Name | English | Math | ComProg |\r\n"
					+ "_________________________________\r\n"
					+ Studentnames [0] + " | " + Grades[0] + " | " + Grades [2]  + " |" + Grades [2] + " | \r\n" 
					+ Studentnames [1] + " | " + Grades[1] + " | " + Grades [4]  + " |" + Grades [5] + " | \r\n"
					+ "----------Grading Sheet-----------");
	} 
}
