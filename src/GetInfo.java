import java.util.Scanner;

public class GetInfo {
	
	public static void getInfo() {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        
        System.out.println("Please enter your age:");
        int age = scan.nextInt();
        
        System.out.printf("Your name is: %s \nYour age is: %d", name, age);
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
	
	public static void main(String[] args) {
		getInfo();
	}
}
