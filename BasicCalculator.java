package maki;
import java.util.Scanner;
public class BasicCalculator {
public static void main(String[] args) {
	
	   Scanner maki = new Scanner(System.in);
       boolean continueCalculating = true;

       while (continueCalculating) {
       try {
       double num1, num2, result;
       String operator;

      System.out.print("Enter First Number: ");
      num1 = maki.nextDouble();
      System.out.print("Select Operator (+, -, /, *, √, 3√): ");
      operator = maki.next();

   		if (operator.equals("√") || operator.equals("3√")) {
	    if (operator.equals("√")) {
	    result = Math.sqrt(num1);
   		System.out.println("The Result is: √" + num1 + " = " + result);
   		} else {
	    result = Math.cbrt(num1);
   	      System.out.println("The Result is: 3√" + num1 + " = " + result);
   	    }
        } else {
        System.out.print("Enter Second Number: ");
        num2 = maki.nextDouble();

        switch (operator) {
        case "+":
                 result = add(num1, num2);
                 System.out.println("The Result is: " + num1 + " + " + num2 + " = " + result);
                 break;
        case "-":
                 result = subtract(num1, num2);
                 System.out.println("The Result is: " + num1 + " - " + num2 + " = " + result);
                 break;
        case "*":
                 result = multiply(num1, num2);
                 System.out.println("The Result is: " + num1 + " * " + num2 + " = " + result);
                 break;
        case "/":
                 if (num2 != 0) {
                 result = divide(num1, num2);
                 System.out.println("The Result is: " + num1 + " / " + num2 + " = " + result);
                 } else {
                  System.out.println("Error: Division by zero.");
                 }
                 break;
        default:
                System.out.println("You Enter Wrong Operator.");
                continue;
                    }
                }

                System.out.print("Do you want to continue calculating? yes or no): ");
                String choice = maki.next();
                continueCalculating = choice.equalsIgnoreCase("yes");
                
                
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter numbers only.");
                maki.next();
            }
        }

        System.out.println("Thank you Goodbye!!");
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
