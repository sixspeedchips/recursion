package edu.cnm.deepdive;

public class Palindromes {


  public static Boolean isStrictPalindrome(String str) {
    return (str.length() <= 1
        || str.charAt(0) == str.charAt(str.length() - 1) && isStrictPalindrome(
        str.substring(1, str.length() - 1)));
  }

  public static Boolean isPalindrome(String str) {
    return isStrictPalindrome(str.replaceAll("[\\W_]", "").toLowerCase());
  }


}
