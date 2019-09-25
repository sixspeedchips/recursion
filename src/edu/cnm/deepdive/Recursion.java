package edu.cnm.deepdive;

public class Recursion {

  public static int countPairs(String str) {

    if (str.length() == 0) {
      return 0;
    }
    return (str.toLowerCase().startsWith("ax") ? 1+countPairs(str.substring(2))
        : countPairs(str.substring(1)));
  }


}
