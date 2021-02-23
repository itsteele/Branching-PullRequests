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
	
	public static void main(String[] args) {
		getInfo();
	}
}
