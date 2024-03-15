package org.howard.edu.lsp.midterm.question1;


/**
 * This class provides methods for encryption operations.
 */
public class SecurityOps {
    /**
     * Encrypts the given text by writing all even-index characters
     * followed by all odd index characters, ignoring punctuation and whitespace.
     *
     * @param text the text to encrypt
     * @return the encrypted text
     */
	   public static String encrypt(String text) {
		    text = text.replaceAll(" ", "");
	        StringBuilder encryptedText = new StringBuilder();

	        // Append even-index characters
	        for (int i = 0; i < text.length(); i += 2) {
	            char ch = text.charAt(i);
	            if (Character.isLetterOrDigit(ch)) { // Check if the character is a letter or digit
	                encryptedText.append(ch); // Append the character to the encrypted text
	            }
	        }

	        // Append odd-index characters
	        for (int i = 1; i < text.length(); i += 2) {
	            char ch = text.charAt(i);
	            if (Character.isLetterOrDigit(ch)) { // Check if the character is a letter or digit
	                encryptedText.append(ch); // Append the character to the encrypted text
	            }
	        }

	        return encryptedText.toString(); // Return the encrypted text as a string
	    }

    /**
     * Driver program.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        String text = "I love CSCI363";
        String encryptedText = encrypt(text);
        System.out.println("Original text: " + text);
        System.out.println("Encrypted text: " + encryptedText);
    }
}


