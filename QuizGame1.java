package maki;
import java.util.Scanner;
public class QuizGame1 {
public static void main(String[] args) {
	
	try {
		  Scanner s = new Scanner(System.in);
	
   System.out.println("---=Welcome to Quiz game!=----");
   System.out.println("---=Enter Yes to continue=--");
   System.out.println("----=Enter any to exit=--");
	      
	 String continueGame = s.nextLine();
		if (!continueGame.equalsIgnoreCase("yes")) 
		{ System.out.println("Exiting the game. Goodbye!");
	     return; 
	    }

	  String question1 = "Where is the Bermuda Triangle located?\n[a] The Atlantic Ocean\n[b] The Pacific Ocean\n[c] Arctic Ocean";
	  String answer1 = "a"; 
	  String question2 = "Which planet is closest to the earth?\n[a] Jupiter\n[b] Saturn\n[c] Mercury";
	  String answer2 = "c";
	  String question3 = "What is the 5th decimal digit of pi?\n[a] 8\n[b] 9\n[c] 7";
	  String answer3 = "b";
	  int score = 0;

	  System.out.println("Question number 1");
	  System.out.println(question1);
	  String userAnswer1 = s.nextLine().toLowerCase(); 

	  if (userAnswer1.equals(answer1)) {
	  System.out.println("Your Correct!");
	  score++; 
	  } 
	  else {
	  System.out.println("Your Wrong Next Question");
	  }
	  System.out.println("Question number 2");
	  System.out.println(question2);
	  String userAnswer2 = s.nextLine().toLowerCase(); 

	  if (userAnswer2.equals(answer2)) {
	    System.out.println("Your Correct!");
	    score++;
	   } else {
	   System.out.println("Your Wrong Next Question");
	   }

	   System.out.println("Question number 3");
	   System.out.println(question3);
	   String userAnswer3 = s.nextLine().toLowerCase(); 

	  if (userAnswer3.equals(answer3)) {
	  System.out.println("Your Correct!");
	  score++; 
	  } else {
	    System.out.println("Your Wrong Next Question");
	  }

	System.out.println("---=The Result of the Quiz game!=----");
	System.out.println("#1 Your " + (userAnswer1.equals(answer1) ? "Correct" : "Wrong") + " Correct Answer [" + answer1 + "] " + question1);
	System.out.println("#2 Your " + (userAnswer2.equals(answer2) ? "Correct" : "Wrong") + " Correct Answer [" + answer2 + "] " + question2);
	System.out.println("#3 Your " + (userAnswer3.equals(answer3) ? "Correct" : "Wrong") + " Correct Answer [" + answer3 + "] " + question3);
	        
	System.out.println("Your Total Score is " + score + "/3 Better Luck Next Time!");
	    s.close();
	        
	    }catch (Exception e ) {
	    	System.out.println ("Enter Letter only");
	    }
	}}

