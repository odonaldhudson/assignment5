import java.io.*;

import java.nio.Buffer;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		System.out.println("mouth vomit here");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		userInput = userInput.trim();
		
		// Integers... what we are counting!
		int linecount = 0;
		int wordcount = 0;
		int charactercount = 0;
		String tempstr = "";

		try {

			File venom = new File(userInput);
			FileReader looker = new FileReader(venom);
			BufferedReader muscles = new BufferedReader(looker);

			while ((tempstr = muscles.readLine()) != null) {
				// Count # of things in a line
				charactercount = tempstr.length();
				String[] words = tempstr.split("( )|(')");
				wordcount = words.length;
				linecount++;
			}

		} catch (FileNotFoundException turd) {
			System.out.println("FOH");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Whats being printed out!
		System.out.println("Line count: " + linecount);
		System.out.println("Word count: " + wordcount);
		System.out.println("Character count: " + charactercount);

	}

}
