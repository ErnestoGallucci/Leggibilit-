package com.example;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    @Test
    void testPalindromaEmptyString() {
        assertTrue(App.Palindroma("", 0, 0), "Una stringa vuota dovrebbe essere considerata palindroma.");
    }

    @Test
    void testPalindromaSingleCharacter() {
        assertTrue(App.Palindroma("a", 0, 0), "Una stringa con un solo carattere dovrebbe essere palindroma.");
    }

    @Test
    void testPalindromaEvenLength() {
        assertTrue(App.Palindroma("anna", 0, 3), "La stringa 'anna' dovrebbe essere palindroma.");
    }

    @Test
    void testPalindromaOddLength() {
        assertTrue(App.Palindroma("radar", 0, 4), "La stringa 'radar' dovrebbe essere palindroma.");
    }

    @Test
    void testNonPalindroma() {
        assertFalse(App.Palindroma("hello", 0, 4), "La stringa 'hello' non è palindroma.");
    }

   /*   @Test
    void testPalindromaWithSpaces() {
        assertTrue(App.Palindroma("a santa at nasa", 0, 14), "La stringa 'a santa at nasa' dovrebbe essere palindroma.");
    }*/

    @Test
    void testPalindromaWithMixedCase() {
        assertFalse(App.Palindroma("Radar", 0, 4), "La stringa 'Radar' non è palindroma con distinzione tra maiuscole e minuscole.");
    }

    @Test
    void testPalindromaWithSpecialCharacters() {
        assertTrue(App.Palindroma("!@##@!", 0, 5), "La stringa '!@##@!' dovrebbe essere palindroma.");
    }

    @Test
    void testNonPalindromaEvenLength() {
        assertFalse(App.Palindroma("abcd", 0, 3), "La stringa 'abcd' non è palindroma.");
    }

    @Test
    void testNonPalindromaOddLength() {
        assertFalse(App.Palindroma("abcde", 0, 4), "La stringa 'abcde' non è palindroma.");
    }
}
