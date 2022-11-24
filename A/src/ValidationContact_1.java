import java.util.Scanner;

public class ValidationContact_1 {
	// 2124567890(valid)
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		String str = sc.next();
		String regex = "^\\d{10}$";
		if (str.matches(regex)) {
			System.out.println("Given number is valid");
		} else {
			System.out.println("Given number is not valid");
		}
	}
}
