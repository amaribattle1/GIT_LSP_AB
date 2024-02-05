package org.howard.edu.lsp.assignment2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounting {

	public static void main(String[] args) 
			throws FileNotFoundException {
		File file = new File("src/org/howard/edu/lsp/assignment2/words.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	 
	}
	
	

}
