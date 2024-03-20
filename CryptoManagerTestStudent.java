/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: This Program is a JUnit test on the class CryptoManager
 * Due: 03/19/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Andy Gunawan
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds("HELLO"));
        assertTrue(CryptoManager.isStringInBounds("\"HELLO WORLD\""));
        assertFalse(CryptoManager.isStringInBounds("test"));
        assertFalse(CryptoManager.isStringInBounds("{HELLO"));
        assertFalse(CryptoManager.isStringInBounds("\"THIS IS A TEST\""));
    }

    @Test
    public void testEncryptCaesar() {
        assertEquals("UFTUJOH", CryptoManager.caesarEncryption("TESTING", 1));
        assertEquals("UIF!XJTU!XFSF!B!VOJRVF", CryptoManager.caesarEncryption("THEY WILL WORK AS PLANNED", 1));
        assertEquals("NCP", CryptoManager.caesarEncryption("KYL", 3));
        assertEquals("BSQ", CryptoManager.caesarEncryption("ZPN", 29));
        assertEquals("QJXKP", CryptoManager.caesarEncryption("LEMON", 10));
    }

    @Test
    public void testDecryptCaesar() {
        assertEquals("TESTING", CryptoManager.caesarDecryption("UFTUJOH", 1));
        assertEquals("THEY WILL WORK AS PLANNED", CryptoManager.caesarDecryption("UIF!XJTU!XFSF!B!VOJRVF", 1));
        assertEquals("KYL", CryptoManager.caesarDecryption("NCP", 3));
        assertEquals("ZPN", CryptoManager.caesarDecryption("BSQ", 29));
        assertEquals("LEMON", CryptoManager.caesarDecryption("QJXKP", 10));
    }

    @Test
    public void testEncryptBellaso() {
        assertEquals("W^AM\\N", CryptoManager.bellasoEncryption("HELLO", "ABCD"));
        assertEquals("JWZ!\"(J!", CryptoManager.bellasoEncryption("TEST", "GHI"));
        assertEquals("Z#``!PYR!YF``UXYVY", CryptoManager.bellasoEncryption("HELLO WORLD", "XYZ"));
        assertEquals("EHCB#ONHSX", CryptoManager.bellasoEncryption("CRYPTO", "HELLO"));
    }

    @Test
    public void testDecryptBellaso() {
        assertEquals("TESTING", CryptoManager.bellasoDecryption("XIRUDX", "ABCD"));
        assertEquals("HELLO", CryptoManager.bellasoDecryption("WU^ZFRSIU\\F", "GHIJKLMNOPQRSTUVWXYZ"));
        assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));
    }
}
