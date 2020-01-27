import java.util.Scanner;

public class Hey{

	public static void main(String[] agrs){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? \n");
		String input = scanner.nextLine();
		System.out.println("Hello, " + input + "!");
		
	}
	
}