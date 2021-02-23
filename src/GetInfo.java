import java.util.Scanner;

public class GetInfo {
	
	public static void getInfo() {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        
        System.out.println("Please enter your age:");
        int age = scan.nextInt();
        
        System.out.println("Please enter your favorite number:");
        int fNumber = scan.nextInt();
        
        System.out.println("Please enter your favorite drink:");
        String drink = scan.nextLine();
        
        System.out.printf("Your name is: %s \nYour age is: %d \nYour favorite number is: %d \nYour favorite drink is %s", name, age, fNumber, drink);
        
    }
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	public static void printGreeting(String name, int hour) {
		if (hour < 12) {
			System.out.println("Good morning, " + name + "!");
		}
		
		if (hour >= 12 & hour < 18) {
			System.out.println("Good afternoon, " + name + "!");
		}
		
		if (hour >= 18) {
			System.out.println("Good evening, " + name + "!");
		}
	}
	
	public static String formatGreeting(String name, int hour) {
		if (hour < 12) {
			return "Good morning, " + name + "!";
		}
		
		if (hour >= 12 & hour < 18) {
			return "Good afternoon, " + name + "!";
		}
		
		if (hour >= 18) {
			return "Good evening, " + name + "!";
		}
		return null;
	}
	
	public static void main(String[] args) {
		getInfo();
	}
}
