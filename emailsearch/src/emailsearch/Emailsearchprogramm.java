package emailsearch;

	import java.util.Scanner;

	public class Emailsearchprogramm {

	    public static void main(String[] args) {
	        
	        String[] emailArray = {
	            "aditya@gmail.com",
	            "rahul@gmail.com",
	            "yash@gmail.com",
	            "saurav@gmail.com",
	            
	        };

	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter the email ID to search: ");
	        String userInput = sc.nextLine();

	        

	        
	        boolean found = false;
	        for (String email : emailArray) {
	            if (email.equals(userInput)) {
	                found = true;
	                break;
	            }
	        }

	       
	        if (found == true) {
	            System.out.println("Email ID found in the array.");
	        } else {
	            System.out.println("Email ID not found in the array.");
	        }
	    }
	}



