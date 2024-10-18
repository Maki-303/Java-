package markjagonap;
import java.util.Scanner;
public class ArrayListInformation {
public static void main(String[] args) {
		try {
			Scanner m = new Scanner (System.in);
			String name [] = { "Kyojiro", "Megumi", "Kugisaki"};
			int age [] = {21, 23,24,};
			String rank [] = {"Hashira", "Hashira 1 ", "Hashira 2"};
			String BreathingStyle [] = {"Flame breathing", "Flame breathing1", "Flame breathing 3"};
			String Gender [] = {"male", "Female", "male"};
			
			System.out.println("Enter the Index of the Demon Slayer Information");
			int maki = m.nextInt();
			
			System.out.println("Name              : " + name [maki]);
			System.out.println("age               : " + age [maki]);
			System.out.println("BreathingStyle    : " + BreathingStyle [maki]);
			System.out.println("Gender            : " + Gender [maki]);
		
	}catch (Exception e) {
		System.out.println("InvalidInout Number Only");
	}

}}
