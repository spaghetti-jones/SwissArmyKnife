/**
 * @author Luis Barrera
 * 
 * Eric Pogue is the author of:
 * HttpRequest.java
 * 
 * Nathaniel Wascher assisted us by allowing us to view his code
 * 
 */

import java.util.Scanner;

public class sak {
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        System.out.println("Now executing sak program...");

		if (args.length == 0) {
			HelpCommand.helpOutput();
		}

        else if (args[0].equalsIgnoreCase("-Help")) {
			System.out.println("-Help is now being executed...");
			HelpCommand.helpOutput();
		}
		
		else if (args[0].equalsIgnoreCase("-HttpRequestIndex") || args[0].equalsIgnoreCase("-HttpRequest")) {
			System.out.println("\nPlease execute the same command again");
			if (args.length == 1) {
				System.out.println("Error... Please enter a valid URL");
			}else{
				int i;
				String link = args[1];
				HttpRequest request = new HttpRequest();
				for (i = 0; i < 1; i++) {
					String userText = scan.nextLine();
					System.out.println(userText);
					if (userText.contains("-HttpRequestIndex")) {
						System.out.println("-HttpRequestIndex is now being executed...");
						request.readURL(link);
						System.out.println("\nYou entered: " + request);
					}
					else if (userText.contains("-HttpRequest")) {
						System.out.println("-HttpRequest is now being executed...");
						request.readURL(link);
						System.out.println("\nYou entered: " + request);
					}
					else {
						System.out.println("Error... Please enter a valid URL");
					}
				}
			}
		}
	}
}