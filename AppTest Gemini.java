package com.example;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    @Test
    public void testEmptyPalindrome() {
      String s = "";
      assertTrue(Palindroma(s, 0, s.length() - 1));
    }
  
    @Test
    public void testSingleCharacterPalindrome() {
      String s = "a";
      assertTrue(Palindroma(s, 0, s.length() - 1));
    }
  
    @Test
    public void testEvenLengthPalindrome() {
      String s = "abba";
      assertTrue(Palindroma(s, 0, s.length() - 1));
    }
  
    @Test
    public void testOddLengthPalindrome() {
      String s = "abcba";
      assertTrue(Palindroma(s, 0, s.length() - 1));
    }
  
    @Test
    public void testNonPalindrome() {
      String s = "abca";
      assertFalse(Palindroma(s, 0, s.length() - 1));
    }
  
    @Test
    public void testCaseInsensitivePalindrome() {
      String s = "Madam";
      assertTrue(Palindroma(s, 0, s.length() - 1));
    }
  }
