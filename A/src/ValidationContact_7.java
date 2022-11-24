import java.util.Scanner;

public class ValidationContact_7 {
	//+12124567890 (not valid)
	//+12124567890 (not valid)
	//+1 212.456.7890 (not valid)
	public static void main(String args[]) { 
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the number:");
	String str=sc.next(); 
	String regex="\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}";
	if(str.matches(regex)) { 
	System.out.println("Given number is valid");
	} else { 
	System.out.println("Given number is not valid"); 
	}
	}
	}
