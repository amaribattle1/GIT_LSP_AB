

package org.howard.edu.lsp.assignment2;

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.FileNotFoundException;

public class WordCounting {

	public static void main(String[] args) {
	  try {
		File file = new File("src/org/howard/edu/lsp/assignment2/words.txt");
		Scanner scanner = new Scanner(file);
		Map<String, Integer> wordCountMap = new HashMap<> ();
		
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] words = line.split("\\s+");
			
			for (String word : words ) {
				word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
				
				if (!word.matches("\\d+") && word.length() >3) {
					wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+ 1);
				}
			
			}
			
			
			
		}
		scanner.close();
		
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	} catch (FileNotFoundException e) {
		System.out.println("File not found: " + e.getMessage());
	 
	}
	
  }
}


