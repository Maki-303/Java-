package Tanong;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 int Score = 0;
	        int Lives = 3;
	        
	        System.out.println("---=Welcome to Quiz game!=----");
	        System.out.println("---=Enter Yes to continue=--");
	        System.out.println("----=Enter any to exit=--");
	        String yes = s.nextLine();

	        String[] Responses = new String[3];
	        
	        if (yes.equalsIgnoreCase("yes")) {

	           
	            while (Lives > 0) {
	                System.out.println("Question number 1");
	                System.out.println("In a website browser address bar, what does 'www' stand for?");
	                System.out.println("[a] World Wide Web");
	                System.out.println("[b] World Wrestling Web");
	                System.out.println("[c] World War Web");
	                Responses[0] = s.nextLine();
	                
	                if (Responses[0].equalsIgnoreCase("a")) {
	                    System.out.println("You're Correct! [a] World Wide Web");
	                    Score++;
	                    break;  
	                } else {
	                    Lives--; 
	                    System.out.println("Wrong answer! You have " + Lives + " lives remaining.");
	                }
	                
	                if (Lives <= 0) break;
	            }

	           
	            if (Lives > 0) {  
	                while (Lives > 0) {
	                    System.out.println("Question number 2");
	                    System.out.println("Who painted the Mona Lisa?");
	                    System.out.println("[a] Kawhi Leonard");
	                    System.out.println("[b] Leonardo DiCaprio");
	                    System.out.println("[c] Leonardo da Vinci");
	                    Responses[1] = s.nextLine();
	                    
	                    if (Responses[1].equalsIgnoreCase("c")) {
	                        System.out.println("You're Correct! [c] Leonardo da Vinci");
	                        Score++;
	                        break;  	                    } else {
	                        Lives--;
	                        System.out.println("Wrong answer! You have " + Lives + " lives remaining.");
	                    }
	                    
	                    if (Lives <= 0) break;
	                }
	            }


	            if (Lives > 0) {  
	                while (Lives > 0) {
	                    System.out.println("Question number 3");
	                    System.out.println("In what year was the internet opened to the public?");
	                    System.out.println("[a] 1992");
	                    System.out.println("[b] 1993");
	                    System.out.println("[c] 1994");
	                    String response3 = s.nextLine();
	                    
	                    if (response3.equalsIgnoreCase("b")) {
	                        System.out.println("You're Correct! [b] 1993");
	                        Score++;
	                        break;  
	                    } else {
	                        Lives--;
	                        System.out.println("Wrong answer! You have " + Lives + " lives remaining.");
	                    }
	                }
	            }


	            System.out.println("---=The Result of the Quiz game!=----");
	            
	            if (Lives > 0) {
	                System.out.println("Congratulations! You've answered all questions correctly. You won with a score of " + Score + " out of 3.");
	            } else {
	                System.out.println("Game Over. You lost! Better luck next time.");
	}

}
	}


		    

		
		
	
	
	
	
	   
	
	
	
	
	
	
	

	

}








