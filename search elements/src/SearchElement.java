import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {



    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
		System.out.println("User Input:");
		 String str=sc.next();
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("https://www.facebook.com/fulioTech/");
        emailID.add("https://www.linkedin.com/company/ful-io/");
        emailID.add("support@ful.io");
        emailID.add("+1 343 303 6668");
        
   
        String searcElement = "Contact";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    System.out.println(emailID.get(i));
                    
                    if(searcElement==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("email ID" + searcElement + "+1 343 303 6668 ");
                        
                        break;
                        
                    }
                }

    }

}


