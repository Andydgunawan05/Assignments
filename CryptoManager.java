/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: This Program Encrypts and Deencrypts Caesar and Bellaso Ciphers
 * Due: 03/19/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Andy Gunawan
*/

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_'; 
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds(String plainText) {
	    if (plainText == null || plainText.isEmpty()) {
	        showAlert("Input string is null or empty.");
	        return false;
	    }
	    for (int i = 0; i < plainText.length(); i++) {
	        char ch = plainText.charAt(i);
	        if (ch < LOWER_RANGE || ch > UPPER_RANGE) {
	            showAlert("The string is not in bounds. Try again.");
	            return false;
	        }
	    }
	    return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	 public static String caesarEncryption(String plainText, int key) {
		    if (!isStringInBounds(plainText)) {
		        return "The selected string is not in bounds, Try again.";
		    }
		    
		    StringBuilder encryptedText = new StringBuilder();
		    for (int i = 0; i < plainText.length(); i++) {
		        char charr = plainText.charAt(i);
		        char encryptedChar = (char) (((charr - LOWER_RANGE + key) % RANGE) + LOWER_RANGE);
		        encryptedText.append(encryptedChar);
		    }
		    return encryptedText.toString();
		}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	 public static String bellasoEncryption(String plainText, String bellasoStr) {
		    StringBuilder encryptedText = new StringBuilder();
		    int bellasoLength = bellasoStr.length();
		    for (int i = 0; i < plainText.length(); i++) {
		        char ch = plainText.charAt(i);
		        char bellasoChar = bellasoStr.charAt(i % bellasoLength);
		        char encryptedChar;
		        if (ch >= LOWER_RANGE && ch <= UPPER_RANGE) {
		            int shift = bellasoChar - LOWER_RANGE;
		            encryptedChar = (char) (((ch - LOWER_RANGE + shift) % RANGE) + LOWER_RANGE);
		        } else {
		            encryptedChar = ch;
		        }
		        encryptedText.append(encryptedChar);
		    }
		    return encryptedText.toString();
		}

	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption(String encryptedText, int key) {
	    StringBuilder decryptedText = new StringBuilder();
	    for (int i = 0; i < encryptedText.length(); i++) {
	        char ch = encryptedText.charAt(i);
	        char decryptedChar = (char) (((ch - LOWER_RANGE - key + RANGE) % RANGE + RANGE) % RANGE + LOWER_RANGE);
	        decryptedText.append(decryptedChar);
	    }
	    return decryptedText.toString();
	}

	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length
	 * 	 * of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
	    StringBuilder decryptedText = new StringBuilder();
	    int bellasoLength = bellasoStr.length();
	    for (int i = 0; i < encryptedText.length(); i++) {
	        char ch = encryptedText.charAt(i);
	        char bellasoChar = bellasoStr.charAt(i % bellasoLength);
	        char decryptedChar = (char) (((ch - LOWER_RANGE - bellasoChar + RANGE) % RANGE) + LOWER_RANGE);
	        decryptedText.append(decryptedChar);
	    }
	    return decryptedText.toString();
	}
	 
      private static void showAlert(String message) 
      {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
      }
}

